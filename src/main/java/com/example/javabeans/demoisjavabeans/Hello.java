package com.example.javabeans.demoisjavabeans;

import org.springframework.hateoas.RepresentationModel;

public class Hello extends RepresentationModel<Hello> {
    private String text;
    private Boolean extended;

    public Hello(final String text, final Boolean extended) {
        this.text = text;
        this.extended = extended;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean isExtended() {
        return extended;
    }

//    public Boolean getExtended() {
//        return extended;
//    }

    public void setExtended(Boolean extended) {
        this.extended = extended;
    }
}
