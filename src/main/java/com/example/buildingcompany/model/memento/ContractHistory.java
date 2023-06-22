package com.example.buildingcompany.model.memento;

import com.example.buildingcompany.model.Contract;

import java.util.Stack;

public class ContractHistory {
    private Stack<Contract.ContractMemento> history;
    private Contract contract; // originator

    public void save() {
        Contract.ContractMemento currentMemento = contract.save();
        history.push(currentMemento);
    }

    public void undo() {
        Contract.ContractMemento lastMemento = history.pop();
        contract.restore(lastMemento);
    }
}
