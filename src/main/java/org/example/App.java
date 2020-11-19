package org.example;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class App
{
    public static void main( String[] args )
    {
        /*<!ELEMENT videoteca (nombre, ubicacion, ultima_actualizacion, peliculas)>
<!ELEMENT nombre (#PCDATA)>
<!ELEMENT ubicacion (#PCDATA)>
<!ELEMENT ultima_actualizacion (#PCDATA)>
<!ELEMENT peliculas (pelicula*)>
<!ELEMENT pelicula (titulo, sinopsis, genero?, enlace_imbd, reparto)>
    <!ATTLIST id CDATA #REQUIRED>
    <!ATTLIST duracion CDATA #REQUIRED>
    <!ATTLIST estreno CDATA #REQUIRED>
<!ELEMENT titulo (#PCDATA)>
<!ELEMENT sinopsis (#PCDATA)>
<!ELEMENT genero (#PCDATA)>
<!ELEMENT enlace_imdb (#PCDATA)>
<!ELEMENT reparto (actor*)>
<!ELEMENT actor (nombre_actor, enlace_wiki)>*/

        JSONObject videoteca = new JSONObject();
        videoteca.put("nombre_videoteca", "Videoteca de Manu");
        videoteca.put("ubicacion", "Casa de Manu");
        videoteca.put("ultima_actualizacion", 0);

        JSONArray peliculas = new JSONArray();

        JSONObject pelicula = new JSONObject();
        pelicula.put("titulo", "El Rey León");

        peliculas.add(pelicula);//Añadir películas a la videoteca

        //Escribir fichero JSON
        try (FileWriter file = new FileWriter("videoteca.json")) {

            file.write(videoteca.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
