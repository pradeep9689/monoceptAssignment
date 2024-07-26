package com.monocept.momentoum.test;

import com.monocept.momentoum.model.CareTaker;
import com.monocept.momentoum.model.TextEditor;

public class TextEditorTest {
	public static void main(String[] args) {
	    TextEditor editor = new TextEditor();
        CareTaker history = new CareTaker();

        // Initial content
        editor.setContent("First version of the document.");
        history.saveState(editor.save());
        System.out.println("Current Content: " + editor.getContent());

        // Make some edits and save state
        editor.setContent("Second version of the document.");
        history.saveState(editor.save());
        System.out.println("Current Content: " + editor.getContent());

        // Make more edits
        editor.setContent("Third version of the document.");
        history.saveState(editor.save());
        System.out.println("Current Content: " + editor.getContent());

        // Restore to a previous version
        editor.restore(history.restoreState(1)); // Restore to the second version
        System.out.println("Restored Content: " + editor.getContent());

        // Continue editing from the restored version
        editor.setContent("Modified content after restoration.");
        history.saveState(editor.save());
        System.out.println("Current Content after modification: " + editor.getContent());

        // Restore to the initial version
        editor.restore(history.restoreState(0)); // Restore to the first version
        System.out.println("Restored Content to initial version: " + editor.getContent());

	}

}
