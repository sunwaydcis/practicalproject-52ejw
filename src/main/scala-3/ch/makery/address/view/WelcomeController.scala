package ch.makery.address.view
import ch.makery.address.MainApp
import javafx.event.ActionEvent
import javafx.fxml.FXML

@FXML
class WelcomeController():
  
  @FXML
  def handleStart(action: ActionEvent): Unit =
    MainApp.showPersonOverview()
