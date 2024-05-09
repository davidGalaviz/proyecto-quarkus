package com.master.naxer;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TextService {
    String getString() {
        return "Magic!";
    }
}
