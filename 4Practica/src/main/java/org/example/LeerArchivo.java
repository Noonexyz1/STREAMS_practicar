package org.example;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class LeerArchivo {

    public File getFileFromResourceFile(String fichero) throws URISyntaxException {
        ClassLoader cargador = getClass().getClassLoader();
        URL resource = cargador.getResource(fichero);
        if (resource == null) {
            throw new IllegalArgumentException("Fichero no encontrado: " + fichero);
        } else {
            return new File(resource.toURI());
        }
    }

}
