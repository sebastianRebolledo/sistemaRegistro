package interfaz;
	
import javafx.application.Application;
import javafx.stage.Stage;
import modelo.ClubMascotas;
import modelo.Mascota;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private static ClubMascotas club= new ClubMascotas();
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		
		Mascota mascota1= new Mascota("Hachiko", "12/23/34", Mascota.EMBRA, Mascota.GATO);
		
		Mascota mascota2= new Mascota("Skiper", "12/23/34", Mascota.EMBRA, Mascota.GATO);

		Mascota mascota3= new Mascota("Clifor", "12/23/34", Mascota.EMBRA, Mascota.GATO);

		Mascota mascota4= new Mascota("mana", "12/23/34", Mascota.EMBRA, Mascota.GATO);

		club.registrarDueño2("Sebastian", "Rebo", "4", "3211");

		club.registrarDueño2("isa", "Sebas", "5", "sfsa");
		
		club.registrarDueño2("isa", "Sebas", "7", "3fss");
		
		club.getPrimerDueño().agregarMascota(mascota2);
		club.getPrimerDueño().agregarMascota(mascota3);
		club.getPrimerDueño().agregarMascota(mascota1);
		club.getPrimerDueño().agregarMascota(mascota4);

System.out.println("Cantidad de mascotas agregads" + club.getPrimerDueño().getContador());
		
		
		System.out.println("Mascotas agregadas al primero");
		club.getPrimerDueño().mostrarMascota();
		

//		(String name,String apellido,String cedula,String fechaNacimiento)
//		club.registrarDueño2("mene","kkk","3" , "999");
//		club.registrarDueño2("mene2", "233", "0", "9990");
		
		
		System.out.println("Imprima");
	club.mostrar();
	
	System.out.println("Eliminar");
	club.eliminarDueño("5");
	club.mostrar();
		launch(args);
	}
}
