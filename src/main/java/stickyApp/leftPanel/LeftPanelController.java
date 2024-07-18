package stickyApp.leftPanel;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class LeftPanelController {

    @FXML
    private VBox notesContainer;

    public void initialize() {

        ArrayList<Note> notes = new ArrayList<Note>();

        notes.add(new Note("Note 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        notes.add(new Note("Note 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        notes.add(new Note("Note 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        notes.add(new Note("Note 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        notes.add(new Note("Note 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        notes.add(new Note("Note 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        notes.add(new Note("Note 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        notes.add(new Note("Note 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        notes.add(new Note("Note 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));



        for (Note note : notes) {
            VBox noteBox = new VBox();
            noteBox.getStyleClass().add("leftPanel-noteBox");

            Label titleLabel = new Label(note.getTitle());
            titleLabel.getStyleClass().add("leftPanel-noteBox-title");

            Label contentLabel = new Label(note.getContent());
            contentLabel.getStyleClass().add("leftPanel-noteBox-content");

            noteBox.getChildren().addAll(titleLabel, contentLabel);
            notesContainer.getChildren().add(noteBox);
        }
    }

}
