package com.proyectoFinal.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "proyectodesarrolloweb-97492.appspot.com";

    final String rutaSuperiorStorage = "imagenTicoAsia";

    final String rutaJsonFile = "firebase";

    final String archivoJsonFile = "proyectodesarrolloweb-97492-firebase-adminsdk-p13ls-16b76eb67c.json";
}
