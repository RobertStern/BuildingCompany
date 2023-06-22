package com.example.buildingcompany.model.visitor;

public interface Element {
    void accept(ElementVisitor elementVisitor);
}
