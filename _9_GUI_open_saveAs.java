import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class _9_GUI_open_saveAs {

  public static void main(String args[]) {
    // Creating the Frame
    JFrame frame = new JFrame("Chat Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);

    // Creating the MenuBar and adding components
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("FILE");
    JMenu m2 = new JMenu("Help");
    mb.add(m1);
    mb.add(m2);
    JMenuItem m11 = new JMenuItem("Open");
    JMenuItem m22 = new JMenuItem("Save as");
    m1.add(m11);
    m1.add(m22);

    // Creating the panel at bottom and adding components
    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("Enter Text");
    JTextField tf = new JTextField(10); // accepts up to 10 characters
    JButton send = new JButton("Send");
    JButton reset = new JButton("Reset");
    panel.add(label); // Components Added using Flow Layout
    panel.add(tf);
    panel.add(send);
    panel.add(reset);

    // Text Area at the Center
    JTextArea ta = new JTextArea();

    // Adding Components to the frame.
    frame.getContentPane().add(BorderLayout.SOUTH, panel);
    frame.getContentPane().add(BorderLayout.NORTH, mb);
    frame.getContentPane().add(BorderLayout.CENTER, ta);
    frame.setVisible(true);

    // Event listener for the "Send" button
    send.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String text = tf.getText();
        ta.append(text + "\n");
        tf.setText("");
      }
    });

    // Event listener for the "Reset" button
    reset.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ta.setText("");
      }
    });

    // Event listener for the "Open" menu item
    m11.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
          File file = fileChooser.getSelectedFile();
          try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
              ta.append(line + "\n");
            }
          } catch (IOException ex) {
            ex.printStackTrace();
          }
        }
      }
    });

    // Event listener for the "Save as" menu item
    m22.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
          File file = fileChooser.getSelectedFile();
          try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            String text = ta.getText();
            writer.write(text);
          } catch (IOException ex) {
            ex.printStackTrace();
          }
        }
      }
    });
  }
}

