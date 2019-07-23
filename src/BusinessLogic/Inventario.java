package BusinessLogic;

import Data.Actividad;
import Data.Auditorio;
import Data.Biblioteca;
import Data.Cursos;
import Data.Edificio;
import Data.EdificioFacultad;
import Data.Eventos;
import Data.Lugar;
import Data.Museo;
import Data.Parqueadero;
import Data.Porteria;
import Data.ZonaComún;
import Data.ZonaDeComida;
import Data.ZonaDeRecreación;
import java.util.ArrayList;

public class Inventario {

    public ArrayList<Lugar> CrearEF() {
        ArrayList<Lugar> edificiosF = new ArrayList<>();
        edificiosF.add(new EdificioFacultad("cine y televisión", "cerca a entrada de la 42", 2, false, 2, "701"));//"/GUI/Imagenes/cineytv.jpg"));
        edificiosF.add(new EdificioFacultad("biologia", "cerca a entrada de la 53", 2, false, 10, "421"));//,"/GUI/Imagenes/biologia.jpg"));
        edificiosF.add(new EdificioFacultad("economia sur ", "cerca a la Av. Carrera 30", 4, true, 4, "311"));//,"/GUI/Imagenes/economia1"));
        edificiosF.add(new EdificioFacultad("ciencia y tecnologia", "cerca a Aulas de Ingenieria", 5, true, 10, "454"));//,"/GUI/Imagenes/cyt.jpg"));
        edificiosF.add(new EdificioFacultad("aulas de ingenieria", "cerca a Ed. Julio Garavito", 3, false, 8, "453"));//,"/GUI/Imagenes/aulas.jpg"));
        edificiosF.add(new EdificioFacultad("julio garavito", "cerca a la Playita", 3, true, 6, "401"));//,"/GUI/Imagenes/"));
        edificiosF.add(new EdificioFacultad("medicina", "Detras del Ed. de Quimica", 5, true, 10, "471"));//,"/GUI/Imagenes/medicina.jpg"));
        edificiosF.add(new EdificioFacultad("polideportivo", "Cerca a la Plaza Ché", 2, false, 2, "103"));//,"/GUI/Imagenes/polideportivo.jpg"));
        edificiosF.add(new EdificioFacultad("observatorio Astronomico", "Cerca a Biologia", 1, false, 2, "413"));//,"/GUI/Imagenes/observatorio.jpg"));
        edificiosF.add(new EdificioFacultad("investigacion y Extension", "Cerca al Laboratorio de Quimica", 4, false, 4, "406"));//,"/GUI/Imagenes/"));
        edificiosF.add(new EdificioFacultad("laboratorios de Hidraulica", "Cerca a laboratorios de ingenieria", 4, false, 2, "409"));//,"/GUI/Imagenes/"));
        edificiosF.add(new EdificioFacultad("sala informatica", "cerca a la Che", 4, false, 2, "101"));//,"/GUI/Imagenes/"));
        edificiosF.add(new EdificioFacultad("zootecnia", "Cerca entrada Carrera 45", 2, false, 3, "561"));//,"/GUI/Imagenes/zootecnia.jpg"));
        edificiosF.add(new EdificioFacultad("ciencias políticas", "cerca a sociologia", 4, false, 8, "212"));//,"/GUI/Imagenes/ciencias politicas.jpg"));
        edificiosF.add(new EdificioFacultad("sociologia", "cerca a enfermeria", 2, false, 4, "205"));//,"/GUI/Imagenes/sociologia.jpg"));
        edificiosF.add(new EdificioFacultad("yu takeuchi", "cerca al edificio insignia de ingenieria", 3, false, 4, "404"));//,"/GUI/Imagenes/fem.jpg"));
        edificiosF.add(new EdificioFacultad("laboratorios ingenieria", "cerca a aulas de ingenieria", 2, false, 2, "407"));//,"/GUI/Imagenes/laoratorios ing.jpg")); 
        edificiosF.add(new EdificioFacultad("genetica", "cerca a la salida de la 53", 4, true, 10, "426"));
        edificiosF.add(new EdificioFacultad("quimica", "cerca al cyt", 3, false, 6, ""));
        edificiosF.add(new EdificioFacultad("farmacia", "detras del Ed. de Quimica", 4, false, 6, ""));
        edificiosF.add(new EdificioFacultad("conservatorio", "cerca a la salida de la 30", 2, false, 6, "305"));
        edificiosF.add(new EdificioFacultad("sindu", "cerca al conservatorio", 2, false, 6, "314"));
        edificiosF.add(new EdificioFacultad("veterinaria", "cerca a agronomia", 1, false, 4, "481"));
        edificiosF.add(new EdificioFacultad("enfermeria", "cerca a medicina", 3, true, 6, "228"));
        edificiosF.add(new EdificioFacultad("derecho", "cerca a enfermeria", 3, false, 6, "201"));
        edificiosF.add(new EdificioFacultad("diseño", "cerca a museo arquitectura", 4, false, 8, "217"));
        edificiosF.add(new EdificioFacultad("ing agricola", "cerca a diseño", 3, false, 4, "214"));
        edificiosF.add(new EdificioFacultad("odontologia", "cerca a posgrados humanas", 3, false, 6, "210"));
        edificiosF.add(new EdificioFacultad("posgrados humanas", "cerca al ICA", 3, true, 6, "225"));
        edificiosF.add(new EdificioFacultad("lenguas extranjeras", "cerca a salida Calle 26", 2, false, 4, "231"));
        edificiosF.add(new EdificioFacultad("filosofia", "cerca a Calle 26", 2, false, 4, "238"));
        edificiosF.add(new EdificioFacultad("agronomia", "cerca a salida corferias", 3, false, 8, "500"));
        edificiosF.add(new EdificioFacultad("posgrados ingenieria", "cerca a los laboratorios de ingenieria", 2, false, 2, "409"));

        return edificiosF;
    }

    public ArrayList<Lugar> CrearB() {
        ArrayList<Lugar> bibliotecas = new ArrayList<>();
        bibliotecas.add(new Biblioteca("biblioteca central", "Plaza Ché", "Artes", 2, "102"));
        bibliotecas.add(new Biblioteca("biblioteca economia", "Ciencias Económicas", "Economía", 0, "310"));
        bibliotecas.add(new Biblioteca("biblioteca agronomia", "Agronomia", "Agronomia", 0, "500"));
        bibliotecas.add(new Biblioteca("biblioteca posgrados ciencias humanas", "Posgrados ", "Ciencias humanas", 0, "225"));
        bibliotecas.add(new Biblioteca("biblioteca hemeroteca", "Hemeroteca", "Artes y recursos audiovisuales", 4, "571"));
        bibliotecas.add(new Biblioteca("biblioteca ciencia y tecnologia", "CyT, Ciencia y tecnologia Luis Carlos Sarmiento Angulo", "ciencia", 0, "454"));
        return bibliotecas;
    }

    public ArrayList<Lugar> CrearP() {
        ArrayList<Lugar> edificiosP = new ArrayList<>();
        edificiosP.add(new Porteria("calle 53", "Cerca a genética", "Calle 53...", "Peatonal, vehicular y biciusuario"));
        edificiosP.add(new Porteria("calle 45", "Cerca al museo de arte", "Calle 45...", "Peatonal"));
        edificiosP.add(new Porteria("ciudad Universitaria", "Cerca Lenguas extrangeras", "Calle 26...", "peatonal"));
        edificiosP.add(new Porteria("resinto ferial", "Cerca a Agronomia", "Calle 26...", "Peatonal"));
        edificiosP.add(new Porteria("banco popular", "Cerca al Banco Popular", "Calle 26...", "Biciusuarios"));
        edificiosP.add(new Porteria("carrera 34", "Cerca a la capilla", "Carrera 34...", "vehicular y Biciusuario"));
        edificiosP.add(new Porteria("carrera 34", "Cerca a Filosofia", "Carrera 34A...", "Vehicular"));
        edificiosP.add(new Porteria("carrera 45", "Cerca a la concha acustica", "Cra 45...", "peatonal, vehicular y biciusuario"));
        edificiosP.add(new Porteria("hemeroteca", "Cerca a la hemeroteca", "Calle 26...", "vehicular y peatonal"));
        return edificiosP;
    }

    public ArrayList<Lugar> CrearA() {
        ArrayList<Lugar> edificiosA = new ArrayList<>();
        edificiosA.add(new Auditorio("leon de greiff", "Plaza Ché", 1000, 6, "104"));
        edificiosA.add(new Auditorio("auditorio a", "Aulas de ingenieria", 100, 6, "453"));
        edificiosA.add(new Auditorio("auditorio b", "Aulas de ingeniería", 100, 6, "453"));
        edificiosA.add(new Auditorio("auditorio c", "Aulas de ingeniería", 100, 6, "453"));
        edificiosA.add(new Auditorio("Enrioque Perez Arbelaez", "Instituto de ciencia", 105, 6, "425"));
        edificiosA.add(new Auditorio("auditorio 01", "Ciencias Económicas", 130, 4, "310"));
        edificiosA.add(new Auditorio("auditorio 02", "Ciencias Económicas", 130, 4, "310"));
        edificiosA.add(new Auditorio("auditorio 03", "Ciencias Económicas", 130, 4, "310"));
        edificiosA.add(new Auditorio("auditorio 04", "Ciencias Económicas", 130, 4, "310"));
        edificiosA.add(new Auditorio("auditorio cyt", "Ciencia y Tecnología", 247, 2, "454"));

        return edificiosA;
    }

    public ArrayList<Lugar> CrearM() {
        ArrayList<Lugar> edificiosM = new ArrayList<>();
        edificiosM.add(new Museo("museo de historia natural", "Instituto de ciencias", "Ciencia", "Mundo Marino, Palabras del maiz, biodiversidad", 6, "425"));
        edificiosM.add(new Museo("museo de a ciencia y el juego", "Concha acústica", "Fenómenos físicos", "Juegos y experimentos", 2, "761"));
        edificiosM.add(new Museo("museo arquitectura", "cerca al polideportivo", "Arquitectura", "Estructuras y maquetas", 2, "207"));
        edificiosM.add(new Museo("museo de arte", "Cerca a la porteria de la calle 45", "Arte", "La Naturaleza de las cosas", 2, "317"));
        return edificiosM;
    }

    public ArrayList<Lugar> CrearPa() {
        ArrayList<Lugar> parqueaderos = new ArrayList<>();
        parqueaderos.add(new Parqueadero("parqueadero hemeroteca", "Hemeroteca", 25));
        parqueaderos.add(new Parqueadero("parqueadero zootecnia", "zootecnia", 15));
        parqueaderos.add(new Parqueadero("parqueadero agronomia", "Agronomia", 45));
        parqueaderos.add(new Parqueadero("parqueadero medicina", "Medicina", 40));
        parqueaderos.add(new Parqueadero("parqueadero cyt", "Cienci y tecnología", 80));
        parqueaderos.add(new Parqueadero("parqueadero fem", "Edificio de física, estadística y matemáticas", 45));
        parqueaderos.add(new Parqueadero("parqueadero odontología", "Odontologia", 20));
        parqueaderos.add(new Parqueadero("parqueadero sociología", "Sociologia", 10));
        parqueaderos.add(new Parqueadero("parqueadero instituto de ciencias", "Instituto de ciencias", 40));
        parqueaderos.add(new Parqueadero("parqueadero biologia", "Biología", 25));
        parqueaderos.add(new Parqueadero("parqueadero ica", "Ica", 15));
        parqueaderos.add(new Parqueadero("parqueadero sindu", "Sindu", 20));
        parqueaderos.add(new Parqueadero("parqueadero economia", "Economía", 50));
        parqueaderos.add(new Parqueadero("parqueadero torre", "Cerca a la sala de informática", 50));

        return parqueaderos;
    }

    public ArrayList<Lugar> CrearZCo() {
        ArrayList<Lugar> ZC = new ArrayList<>();
        ZC.add(new ZonaDeComida("tostao", "Leon de Greiff", "cafeteria"));
        ZC.add(new ZonaDeComida("semillas", "Psgrados de humanas", "cafeteria"));
        ZC.add(new ZonaDeComida("canela terraza", "CyT", "cafeteria"));
        ZC.add(new ZonaDeComida("canela", "Edificio Insignia", "cafeteria"));
        ZC.add(new ZonaDeComida("comedor economía", "Economía", "comedor"));
        ZC.add(new ZonaDeComida("comedor fem", "Edificio de Fisica, estadística y matemáticas", "comedor"));
        ZC.add(new ZonaDeComida("comedor biología", "biologia", "comedor"));
        ZC.add(new ZonaDeComida("comedor agronomia", "Agronomía", "comedor"));
        ZC.add(new ZonaDeComida("comedor la flecha", "Cerca a ciencias políticas", "comedor"));
        ZC.add(new ZonaDeComida("comedor central", "Polideportivo", "comedor"));
        ZC.add(new ZonaDeComida("comedor hemeroteca", "Hemeroteca", "comedor"));
        ZC.add(new ZonaDeComida("cosechas Arquitectura", "cerca a las ruinas de arquitectura", "batidos y snacks"));
        ZC.add(new ZonaDeComida("cosechas central", "Plaza Ché", "batidos y snacks"));

        return ZC;
    }

    public ArrayList<Lugar> CrearZC() {
        ArrayList<Lugar> Zcomun = new ArrayList<>();
        Zcomun.add(new ZonaComún("capilla", "Cerca a la calle 34"));
        Zcomun.add(new ZonaComún("canchas patios", "Cerca a los laboratorios de ingeniería"));
        Zcomun.add(new ZonaComún("canchas porteria calle 53", "Cerca a la calle 53"));
        Zcomun.add(new ZonaComún("canchas cine y televisión", "Cerca a cine y televisión"));
        Zcomun.add(new ZonaComún("canchas cubierta", "Cerca al estadio"));
        Zcomun.add(new ZonaComún("canchas ruinas de arquitectura", "Cerca a ciencias económicas"));
        Zcomun.add(new ZonaComún("playita", "Cerca a la Plaza Ché"));
        Zcomun.add(new ZonaComún("parque de Humboldt", "Cercaa veterinaria"));
        Zcomun.add(new ZonaComún("canchas tiro al blanco", "Cerca a la carrera 45"));

        return Zcomun;
    }

    public ArrayList<Lugar> CrearZR() {
        ArrayList<Lugar> zonasRecreacion = new ArrayList<>();
        zonasRecreacion.add(new ZonaDeRecreación("concha acustica", "cerca a salida calle 45", "Variedad deportes", 4, "761"));
        zonasRecreacion.add(new ZonaDeRecreación("estadio", "cerca a calle 45", "Variedad deportes", 4, "405"));

        return zonasRecreacion;

    }

    public ArrayList<Edificio> CrearEd() {
        ArrayList<Edificio> edificiosF = new ArrayList<>();

        edificiosF.add(new EdificioFacultad("cine y televisión", "cerca a entrada de la 42", 2, false, 2, "701"));
        edificiosF.add(new EdificioFacultad("biologia", "cerca a entrada de la 53", 2, false, 10, "421"));
        edificiosF.add(new EdificioFacultad("economia sur ", "cerca a la Av. Carrera 30", 4, true, 4, "311"));
        edificiosF.add(new EdificioFacultad("economia norte", "cerca a la Av. Carrera 30", 2, false, 4, "310"));
        edificiosF.add(new EdificioFacultad("ciencia y tecnologia", "cerca a Aulas de Ingenieria", 5, true, 10, "454"));
        edificiosF.add(new EdificioFacultad("aulas de ingenieria", "cerca a Ed. Julio Garavito", 3, false, 8, "453"));
        edificiosF.add(new EdificioFacultad("julio garavito", "cerca a la Playita", 3, true, 6, "401"));
        edificiosF.add(new EdificioFacultad("medicina", "Detras del Ed. de Quimica", 5, true, 10, "471"));
        edificiosF.add(new EdificioFacultad("polideportivo", "Cerca a la Plaza Ché", 2, false, 2, "103"));
        edificiosF.add(new EdificioFacultad("observatorio Astronomico", "Cerca a Biologia", 1, false, 2, "413"));
        edificiosF.add(new EdificioFacultad("investigacion y Extension", "Cerca al Laboratorio de Quimica", 4, false, 4, "406"));
        edificiosF.add(new EdificioFacultad("museo Historia Natural", "Cerca a Calle 53", 3, false, 6, "425"));
        edificiosF.add(new EdificioFacultad("laboratorios de Hidraulica", "Cerca a laboratorios de ingenieria", 4, false, 2, "409"));
        edificiosF.add(new EdificioFacultad("sala informatica", "cerca a la Che", 4, false, 2, "101"));
        edificiosF.add(new EdificioFacultad("zootecnia", "Cerca entrada Carrera 45", 2, false, 3, "561"));
        edificiosF.add(new EdificioFacultad("medicina", "Cerca a la Playita", 5, true, 10, "471"));
        return edificiosF;
    }

    public ArrayList<Lugar> CrearLugar() {
        ArrayList<Lugar> edificiosF = new ArrayList<>();

        edificiosF.add(new EdificioFacultad("cine y televisión", "cerca a entrada de la 42", 2, false, 2, "701"));//"/GUI/Imagenes/cineytv.jpg"));
        edificiosF.add(new EdificioFacultad("biologia", "cerca a entrada de la 53", 2, false, 10, "421"));//,"/GUI/Imagenes/biologia.jpg"));
        edificiosF.add(new EdificioFacultad("economia sur ", "cerca a la Av. Carrera 30", 4, true, 4, "311"));//,"/GUI/Imagenes/economia1"));
        edificiosF.add(new EdificioFacultad("ciencia y tecnologia", "cerca a Aulas de Ingenieria", 5, true, 10, "454"));//,"/GUI/Imagenes/cyt.jpg"));
        edificiosF.add(new EdificioFacultad("aulas de ingenieria", "cerca a Ed. Julio Garavito", 3, false, 8, "453"));//,"/GUI/Imagenes/aulas.jpg"));
        edificiosF.add(new EdificioFacultad("julio garavito", "cerca a la Playita", 3, true, 6, "401"));//,"/GUI/Imagenes/"));
        edificiosF.add(new EdificioFacultad("medicina", "Detras del Ed. de Quimica", 5, true, 10, "471"));//,"/GUI/Imagenes/medicina.jpg"));
        edificiosF.add(new EdificioFacultad("polideportivo", "Cerca a la Plaza Ché", 2, false, 2, "103"));//,"/GUI/Imagenes/polideportivo.jpg"));
        edificiosF.add(new EdificioFacultad("observatorio Astronomico", "Cerca a Biologia", 1, false, 2, "413"));//,"/GUI/Imagenes/observatorio.jpg"));
        edificiosF.add(new EdificioFacultad("investigacion y Extension", "Cerca al Laboratorio de Quimica", 4, false, 4, "406"));//,"/GUI/Imagenes/"));
        edificiosF.add(new EdificioFacultad("laboratorios de Hidraulica", "Cerca a laboratorios de ingenieria", 4, false, 2, "409"));//,"/GUI/Imagenes/"));
        edificiosF.add(new EdificioFacultad("sala informatica", "cerca a la Che", 4, false, 2, "101"));//,"/GUI/Imagenes/"));
        edificiosF.add(new EdificioFacultad("zootecnia", "Cerca entrada Carrera 45", 2, false, 3, "561"));//,"/GUI/Imagenes/zootecnia.jpg"));
        edificiosF.add(new EdificioFacultad("ciencias políticas", "cerca a sociologia", 4, false, 8, "212"));//,"/GUI/Imagenes/ciencias politicas.jpg"));
        edificiosF.add(new EdificioFacultad("sociologia", "cerca a enfermeria", 2, false, 4, "205"));//,"/GUI/Imagenes/sociologia.jpg"));
        edificiosF.add(new EdificioFacultad("yu takeuchi", "cerca al edificio insignia de ingenieria", 3, false, 4, "404"));//,"/GUI/Imagenes/fem.jpg"));
        edificiosF.add(new EdificioFacultad("laboratorios ingenieria", "cerca a aulas de ingenieria", 2, false, 2, "407"));//,"/GUI/Imagenes/laoratorios ing.jpg")); 
        edificiosF.add(new EdificioFacultad("genetica", "cerca a la salida de la 53", 4, true, 10, "426"));
        edificiosF.add(new EdificioFacultad("quimica", "cerca al cyt", 3, false, 6, ""));
        edificiosF.add(new EdificioFacultad("farmacia", "detras del Ed. de Quimica", 4, false, 6, ""));
        edificiosF.add(new EdificioFacultad("conservatorio", "cerca a la salida de la 30", 2, false, 6, "305"));
        edificiosF.add(new EdificioFacultad("sindu", "cerca al conservatorio", 2, false, 6, "314"));
        edificiosF.add(new EdificioFacultad("veterinaria", "cerca a agronomia", 1, false, 4, "481"));
        edificiosF.add(new EdificioFacultad("enfermeria", "cerca a medicina", 3, true, 6, "228"));
        edificiosF.add(new EdificioFacultad("derecho", "cerca a enfermeria", 3, false, 6, "201"));
        edificiosF.add(new EdificioFacultad("diseño", "cerca a museo arquitectura", 4, false, 8, "217"));
        edificiosF.add(new EdificioFacultad("ing agricola", "cerca a diseño", 3, false, 4, "214"));
        edificiosF.add(new EdificioFacultad("odontologia", "cerca a posgrados humanas", 3, false, 6, "210"));
        edificiosF.add(new EdificioFacultad("posgrados humanas", "cerca al ICA", 3, true, 6, "225"));
        edificiosF.add(new EdificioFacultad("lenguas extranjeras", "cerca a salida Calle 26", 2, false, 4, "231"));
        edificiosF.add(new EdificioFacultad("filosofia", "cerca a Calle 26", 2, false, 4, "238"));
        edificiosF.add(new EdificioFacultad("agronomia", "cerca a salida corferias", 3, false, 8, "500"));
        edificiosF.add(new EdificioFacultad("posgrados ingenieria", "cerca a los laboratorios de ingenieria", 2, false, 2, "409"));
        edificiosF.add(new Auditorio("leon de greiff", "Plaza Ché", 1000, 6, "104"));
        edificiosF.add(new Auditorio("auditorio a", "Aulas de ingenieria", 100, 6, "453"));
        edificiosF.add(new Auditorio("auditorio b", "Aulas de ingeniería", 100, 6, "453"));
        edificiosF.add(new Auditorio("auditorio c", "Aulas de ingeniería", 100, 6, "453"));
        edificiosF.add(new Auditorio("Enrioque Perez Arbelaez", "Instituto de ciencia", 105, 6, "425"));
        edificiosF.add(new Auditorio("auditorio 01", "Ciencias Económicas", 130, 4, "310"));
        edificiosF.add(new Auditorio("auditorio 02", "Ciencias Económicas", 130, 4, "310"));
        edificiosF.add(new Auditorio("auditorio 03", "Ciencias Económicas", 130, 4, "310"));
        edificiosF.add(new Auditorio("auditorio 04", "Ciencias Económicas", 130, 4, "310"));
        edificiosF.add(new Auditorio("auditorio cyt", "Ciencia y Tecnología", 247, 2, "454"));
        edificiosF.add(new Porteria("calle 53", "Cerca a genética", "Calle 53...", "Peatonal, vehicular y biciusuario"));
        edificiosF.add(new Porteria("calle 45", "Cerca al museo de arte", "Calle 45...", "Peatonal"));
        edificiosF.add(new Porteria("Ciudad Universitaria", "Cerca Lenguas extrangeras", "Calle 26...", "peatonal"));
        edificiosF.add(new Porteria("resinto ferial", "Cerca a Agronomia", "Calle 26...", "Peatonal"));
        edificiosF.add(new Porteria("Banco popular", "Cerca al Banco Popular", "Calle 26...", "Biciusuarios"));
        edificiosF.add(new Porteria("Carrera 34", "Cerca a la capilla", "Carrera 34...", "vehicular y Biciusuario"));
        edificiosF.add(new Porteria("carrera 34", "Cerca a Filosofia", "Carrera 34A...", "Vehicular"));
        edificiosF.add(new Porteria("Carrera 45", "Cerca a la concha acustica", "Cra 45...", "peatonal, vehicular y biciusuario"));
        edificiosF.add(new Porteria("Hemeroteca", "Cerca a la hemeroteca", "Calle 26...", "vehicular y peatonal"));
        edificiosF.add(new Biblioteca("biblioteca central", "Plaza Ché", "Artes", 2, "102"));
        edificiosF.add(new Biblioteca("biblioteca economia", "Ciencias Económicas", "Economía", 0, "310"));
        edificiosF.add(new Biblioteca("biblioteca agronomia", "Agronomia", "Agronomia", 0, "500"));
        edificiosF.add(new Biblioteca("biblioteca posgrados ciencias humanas", "Posgrados ", "Ciencias humanas", 0, "225"));
        edificiosF.add(new Biblioteca("biblioteca hemeroteca", "Hemeroteca", "Artes y recursos audiovisuales", 4, "571"));
        edificiosF.add(new Biblioteca("biblioteca ciencia y tecnologia", "CyT, Cienci y tecnologia Luis Carlos Sarmiento Angulo", "ciencia", 0, "454"));
        edificiosF.add(new Museo("museo de historia natural", "Instituto de ciencias", "Ciencia", "Mundo Marino, Palabras del maiz, biodiversidad", 6, "425"));
        edificiosF.add(new Museo("museo de a ciencia y el juego", "Concha acústica", "Fenómenos físicos", "Juegos y experimentos", 2, "761"));
        edificiosF.add(new Museo("museo arquitectura", "cerca al polideportivo", "Arquitectura", "Estructuras y maquetas", 2, "207"));
        edificiosF.add(new Museo("museo de arte", "Cerca a la porteria de la calle 45", "Arte", "La Naturaleza de las cosas", 2, "317"));
        edificiosF.add(new Parqueadero("parqueadero hemeroteca", "Hemeroteca", 25));
        edificiosF.add(new Parqueadero("parqueadero zootecnia", "zootecnia", 15));
        edificiosF.add(new Parqueadero("parqueadero agronomia", "Agronomia", 45));
        edificiosF.add(new Parqueadero("parqueadero medicina", "Medicina", 40));
        edificiosF.add(new Parqueadero("parqueadero cyt", "Cienci y tecnología", 80));
        edificiosF.add(new Parqueadero("parqueadero fem", "Edificio de física, estadística y matemáticas", 45));
        edificiosF.add(new Parqueadero("parqueadero odontologia", "Odontologia", 20));
        edificiosF.add(new Parqueadero("parqueadero sociologia", "Sociologia", 10));
        edificiosF.add(new Parqueadero("parqueadero instituto de ciencias", "Instituto de ciencias", 40));
        edificiosF.add(new Parqueadero("parqueadero biologia", "Biología", 25));
        edificiosF.add(new Parqueadero("parqueadero ica", "Ica", 15));
        edificiosF.add(new Parqueadero("parqueadero sindu", "Sindu", 20));
        edificiosF.add(new Parqueadero("parqueadero economia", "Economía", 50));
        edificiosF.add(new Parqueadero("parqueadero torre", "Cerca a la sala de informática", 50));
        edificiosF.add(new ZonaDeComida("tostao", "Leon de Greiff", "cafeteria"));
        edificiosF.add(new ZonaDeComida("semillas", "Psgrados de humanas", "cafeteria"));
        edificiosF.add(new ZonaDeComida("canela terraza", "CyT", "cafeteria"));
        edificiosF.add(new ZonaDeComida("canela", "Edificio Insignia", "cafeteria"));
        edificiosF.add(new ZonaDeComida("comedor economía", "Economía", "comedor"));
        edificiosF.add(new ZonaDeComida("comedor fem", "Edificio de Fisica, estadística y matemáticas", "comedor"));
        edificiosF.add(new ZonaDeComida("comedor biología", "biologia", "comedor"));
        edificiosF.add(new ZonaDeComida("comedor agronomia", "Agronomía", "comedor"));
        edificiosF.add(new ZonaDeComida("comedor la flecha", "Cerca a ciencias políticas", "comedor"));
        edificiosF.add(new ZonaDeComida("comedor central", "Polideportivo", "comedor"));
        edificiosF.add(new ZonaDeComida("comedor hemeroteca", "Hemeroteca", "comedor"));
        edificiosF.add(new ZonaDeComida("Cosechas Arquitectura", "cerca a las ruinas de arquitectura", "batidos y snacks"));
        edificiosF.add(new ZonaDeComida("Cosechas central", "Plaza Ché", "batidos y snacks"));
        edificiosF.add(new ZonaComún("capilla", "Cerca a la calle 34"));
        edificiosF.add(new ZonaComún("canchas patios", "Cerca a los laboratorios de ingeniería"));
        edificiosF.add(new ZonaComún("canchas porteria calle 53", "Cerca a la calle 53"));
        edificiosF.add(new ZonaComún("canchas cine y televisión", "Cerca a cine y televisión"));
        edificiosF.add(new ZonaComún("canchas cubierta", "Cerca al estadio"));
        edificiosF.add(new ZonaComún("canchas ruinas de arquitectura", "Cerca a ciencias económicas"));
        edificiosF.add(new ZonaComún("playita", "Cerca a la Plaza Ché"));
        edificiosF.add(new ZonaComún("parque de Humboldt", "Cercaa veterinaria"));
        edificiosF.add(new ZonaComún("canchas tiro al blanco", "Cerca a la carrera 45"));
        edificiosF.add(new ZonaDeRecreación("concha acustica", "cerca a salida calle 45", "Variedad deportes", 4, "761"));
        edificiosF.add(new ZonaDeRecreación("estadio", "cerca a calle 45", "Variedad deportes", 4, "405"));

        return edificiosF;
    }

    public ArrayList<Actividad> CrearActividades() {
        ArrayList<Actividad> actividades = new ArrayList<>();

        actividades.add(new Eventos("24/09/19", "Seminario", "9:00 - 11:00", "Seminario Ingenieros"));
        actividades.add(new Eventos("26/07/19", "Charla", "9:00 - 11:00", "La importancia de evacuar"));
        actividades.add(new Eventos("04/10/19", "cine foro", "9:00 - 11:00", "Colombia"));
        actividades.add(new Eventos("30/11/19", "conferencia", "9:00 - 11:00", "Superaciones Personales"));

        actividades.add(new Cursos("Deportes", "16:00pm - 18:00pm", "Futbol Femenino", "lunes y jueves", 6431));
        actividades.add(new Cursos("Deportes", "2:00pm - 4:00pm", "Rugbi Femenino", "martes", 5434));
        actividades.add(new Cursos("Ciencia", "2:00pm - 4:00pm", "Rugbi Masculino", "viernes", 8122));
        actividades.add(new Cursos("Arte", "2:00pm - 18:00pm", "Clases de salsa", "lunes y martes", 8732));

        return actividades;

    }

    public ArrayList<Actividad> Eventos() {
        ArrayList<Actividad> actividades = new ArrayList<>();
        actividades.add(new Eventos("24/09/19", "Seminario", "9:00 - 11:00", "Seminario Ingenieros"));
        actividades.add(new Eventos("26/07/19", "Charla", "9:00 - 11:00", "La importancia de evacuar"));
        actividades.add(new Eventos("04/10/19", "cine foro", "9:00 - 11:00", "Colombia"));
        actividades.add(new Eventos("30/11/19", "conferencia", "9:00 - 11:00", "SSuperaciones Personales"));

        return actividades;
    }

    public ArrayList<Actividad> Cursos() {
        ArrayList<Actividad> actividades = new ArrayList<>();
        actividades.add(new Cursos("Deportes", "16:00pm - 18:00pm", "Futbol Femenino", "lunes y jueves", 6431));
        actividades.add(new Cursos("Deportes", "2:00pm - 4:00pm", "Rugbi Femenino", "martes", 5434));
        actividades.add(new Cursos("Ciencia", "2:00pm - 4:00pm", "Rugbi Masculino", "viernes", 8122));
        actividades.add(new Cursos("Arte", "2:00pm - 18:00pm", "Clases de salsa", "lunes y martes", 8732));

        return actividades;
    }

}
