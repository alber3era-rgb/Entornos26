package com.example.controller;

import com.example.model.ContactForm;
import com.example.service.ContactService;
import com.example.util.Logger;

public class ContactController {

    private ContactService service;

    public ContactController() {
        service = new ContactService();
    }

    public void submitContactForm(String name, String email) {
        Logger.log("Recibiendo formulario de contacto...");

        // --- CORRECCIÓN DEL ERROR ---
        if (name == null || name.trim().isEmpty() || email == null || email.trim().isEmpty()) {
            Logger.log("ERROR: Validación fallida. Los campos están vacíos.");
            System.out.println(">>> Error de validación: El nombre y el email no pueden estar vacíos.");
        } else {
            ContactForm form = new ContactForm(name, email);
            service.processForm(form);
            Logger.log("Formulario procesado con éxito.");
        }
        // ----------------------------

        Logger.log("Fin de submitContactForm");
    }
}