package BusinessLogic;

import Data.Actividad;
import Data.Edificio;
import Data.Lugar;
import Data.Usuario;
import GUI.Ventana.VentanaPrincipal;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Funcionamiento implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchElementException {
        
      new VentanaPrincipal().setVisible(true);
      
    }
}
