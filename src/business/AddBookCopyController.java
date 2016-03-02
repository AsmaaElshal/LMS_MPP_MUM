package business;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import dataaccess.DataAccessSingleton;
import dataaccess.storage.Book;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class AddBookCopyController implements Initializable{
	
	@FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> isbnColumn;
    @FXML
    private TableColumn<Book, String> titleColumn;
	@FXML
	private TextField numberOfCopies;
	
	@FXML 
	private Button btnSubmit;
	
	@FXML
	private Button btnBack;
	
	@FXML
    void addBookCopies(ActionEvent event) throws IOException {    
		Book book =(Book)bookTable.getSelectionModel().getSelectedItem();
		if(book == null){
			AlertDialog.showErrorAlert("Please select a book!");
		}
		try{
			Integer num = Integer.valueOf(numberOfCopies.getText());
			book.addNumberOfCopies(num);
			AlertDialog.showInformationAlert("Book copies are added successfully!");
			
		}catch(NumberFormatException ex){
			AlertDialog.showErrorAlert("Please input a number!");
		}
    }

    @FXML
    void goBack(ActionEvent event) throws IOException {
    /*	Stage stage = (Stage) btnBack.getScene().getWindow();
    	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(Main.ROOT_UI));
        BorderPane rootLayout = (BorderPane) loader.load();
        Scene scene = new Scene(rootLayout);
        scene.getStylesheets().add(getClass().getResource(Main.CSS).toExternalForm());
        stage.getIcons().add(new Image(Main.APP_ICON));
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
        
        FXMLLoader viewLoader = new FXMLLoader();
        viewLoader.setLocation(getClass().getResource(Main.MAIN_UI));
        AnchorPane personOverview = (AnchorPane) viewLoader.load();
        // Set person overview into the center of root layout.
        rootLayout.setCenter(personOverview);*/
    	ViewController.loadView(Resource.Main);
    }
    
    @Override
	public void initialize(URL location, ResourceBundle resources){
    	ObservableList<Book> bookData = FXCollections.observableArrayList();
    	bookData.addAll(DataAccessSingleton.getDataAccess().getBooks().values());
    	bookTable.setItems(bookData);
    	isbnColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getISBN()));
    	titleColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitle()));
    }

}
