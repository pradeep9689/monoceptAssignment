package com.monocept.momentoum.model;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	 private List<TextEditorMemento> savedStates = new ArrayList<>();

	    public void saveState(TextEditorMemento memento) {
	        savedStates.add(memento);
	    }

	    public TextEditorMemento restoreState(int index) {
	        return savedStates.get(index);
	    }
	}