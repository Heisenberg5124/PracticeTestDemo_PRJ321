package validation;

import javax.swing.*;

public class Validation {
    public boolean checkIDInput(JTextField idTxtField) {
        String input = idTxtField.getText().trim().toUpperCase();
        idTxtField.setText(input);
        if (!input.matches("^M\\d{3}$")) {
            JOptionPane.showMessageDialog(null, "Magazine ID: M + 3 digits.");
            idTxtField.requestFocus();
            return false;
        }
        return true;
    }

    public boolean checkEmptyInput(JTextField textField) {
        String input = textField.getText().trim();
        textField.setText(input);
        if (input.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please fill the text field");
            textField.requestFocus();
            return false;
        }
        return true;
    }
}
