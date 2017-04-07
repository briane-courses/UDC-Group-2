package control.secretary;

import control.AgendaControl;
import control.CalendarControl;
import control.DayControl;
import control.WeekControl;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class SecretaryMainControl {
	
	@FXML private AnchorPane calendarView;
    @FXML private AnchorPane agendaView;
    @FXML private AnchorPane dayView;
    @FXML private AnchorPane weekView;
    
    @FXML private Button registerButton;
    @FXML private Button loginButton;
    @FXML private Button setAppButton;
    @FXML private Button rmvAppButton;
    
    @FXML private CalendarControl calendarViewController;
    @FXML private AgendaControl agendaViewController;
    @FXML private DayControl dayViewController;
    @FXML private WeekControl weekViewController;
    
    @FXML private SecretaryRegisterControl secRegisterController;
    @FXML private SecretaryLoginControl secLoginController;
    @FXML private SecretaryStartUpControl secStartUpController;
    @FXML private SecretaryToolbarControl secToolbarController; 
    
    @FXML
    public void initialize() {
    	registerButton.setOnAction(event -> {
			setSecRegStage();
		});
    	
    	loginButton.setOnAction(event -> {
			setSecLoginStage();
		});
    	
    	// set/delete appointment stage
    }
    
    private void setSecRegStage() {
    	try {
    		Stage stage = new Stage ();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/secretary/SecretaryRegisterPane.fxml"));
			Scene scene = new Scene(loader.load(), 1090, 590);
		
			scene.getStylesheets().add(getClass().getResource("/config/style-config.css").toExternalForm());
			secRegisterController = loader.getController();
			
			stage.setResizable(false);
			stage.setScene(scene);
			stage.show();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
    
    private void setSecLoginStage() {
    	try {
    		Stage stage = new Stage ();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/secretary/SecretaryLoginPane.fxml"));
			Scene scene = new Scene(loader.load(), 1090, 590);
		
			scene.getStylesheets().add(getClass().getResource("/config/style-config.css").toExternalForm());
			secLoginController = loader.getController();
			
			stage.setResizable(false);
			stage.setScene(scene);
			stage.show();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }

}
