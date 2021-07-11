package io.pzstorm.installer.gui;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DirectoriesPanel {
    private JPanel root;
    private JPanel dirPanel;
    private JTextField gameDirField;
    private JTextField installDirField;
    private JLabel installDirFieldLabel;
    private JButton backButton;
    private JButton nextButton;
    private JLabel gameDirFieldLabel;

    public DirectoriesPanel() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Application.INSTANCE.switchTo("MainPanel");
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        root = new JPanel();
        root.setLayout(new BorderLayout(0, 0));
        dirPanel = new JPanel();
        dirPanel.setLayout(new FormLayout("fill:50px:noGrow,fill:d:grow,fill:d:grow,fill:max(d;4px):noGrow,fill:50px:noGrow", "center:max(d;4px):noGrow,top:4dlu:noGrow,top:30dlu:grow,center:max(d;4px):noGrow,center:30dlu:grow,center:max(d;4px):noGrow,center:40dlu:grow"));
        dirPanel.setAlignmentX(0.5f);
        dirPanel.setBackground(new Color(-14604221));
        dirPanel.setDoubleBuffered(false);
        dirPanel.setEnabled(true);
        dirPanel.setForeground(new Color(-16777216));
        dirPanel.setMinimumSize(new Dimension(1, 1));
        dirPanel.setPreferredSize(new Dimension(600, 300));
        root.add(dirPanel, BorderLayout.CENTER);
        gameDirField = new JTextField();
        gameDirField.setName("");
        gameDirField.setPreferredSize(new Dimension(100, 30));
        gameDirField.setText("");
        gameDirField.setToolTipText("");
        CellConstraints cc = new CellConstraints();
        dirPanel.add(gameDirField, cc.xyw(2, 4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        installDirField = new JTextField();
        installDirField.setPreferredSize(new Dimension(100, 30));
        installDirField.setToolTipText("");
        dirPanel.add(installDirField, cc.xyw(2, 6, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        installDirFieldLabel = new JLabel();
        installDirFieldLabel.setBackground(new Color(-7978430));
        installDirFieldLabel.setForeground(new Color(-1));
        installDirFieldLabel.setHorizontalAlignment(0);
        installDirFieldLabel.setHorizontalTextPosition(0);
        installDirFieldLabel.setMinimumSize(new Dimension(0, 20));
        installDirFieldLabel.setOpaque(true);
        installDirFieldLabel.setPreferredSize(new Dimension(0, 20));
        installDirFieldLabel.setText("Enter the desired Storm installation directory:");
        dirPanel.add(installDirFieldLabel, cc.xyw(2, 5, 3, CellConstraints.DEFAULT, CellConstraints.BOTTOM));
        backButton = new JButton();
        backButton.setMinimumSize(new Dimension(100, 30));
        backButton.setPreferredSize(new Dimension(100, 30));
        backButton.setText("Back");
        dirPanel.add(backButton, new CellConstraints(2, 7, 1, 1, CellConstraints.RIGHT, CellConstraints.DEFAULT, new Insets(10, 0, 0, 10)));
        nextButton = new JButton();
        nextButton.setMinimumSize(new Dimension(100, 30));
        nextButton.setPreferredSize(new Dimension(100, 30));
        nextButton.setText("Next");
        dirPanel.add(nextButton, new CellConstraints(3, 7, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT, new Insets(10, 10, 0, 0)));
        gameDirFieldLabel = new JLabel();
        gameDirFieldLabel.setBackground(new Color(-7978430));
        gameDirFieldLabel.setForeground(new Color(-1));
        gameDirFieldLabel.setHorizontalAlignment(0);
        gameDirFieldLabel.setHorizontalTextPosition(0);
        gameDirFieldLabel.setMinimumSize(new Dimension(0, 20));
        gameDirFieldLabel.setOpaque(true);
        gameDirFieldLabel.setPreferredSize(new Dimension(0, 20));
        gameDirFieldLabel.setRequestFocusEnabled(false);
        gameDirFieldLabel.setText("Enter the Project Zomboid installation directory:");
        dirPanel.add(gameDirFieldLabel, cc.xywh(2, 1, 3, 3, CellConstraints.FILL, CellConstraints.BOTTOM));
        installDirFieldLabel.setLabelFor(installDirField);
        gameDirFieldLabel.setLabelFor(gameDirField);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return root;
    }

}