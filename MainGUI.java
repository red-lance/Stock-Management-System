package stockmanagement;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainGUI extends JFrame {
    private int index = 0;
    public MainGUI() {
        super("Investment Portfolio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setBackground(Color.BLACK);
        setForeground(Color.CYAN);
        Font font = new Font("CALIBRI", Font.BOLD, 25); 
        
        JButton profileButton = new JButton("Profile");
        profileButton.setFont(font);
        profileButton.setBackground(Color.CYAN);
        
        JButton buyButton = new JButton("Buy Investment");
        buyButton.setFont(font);
        buyButton.setBackground(Color.CYAN);
        
        JButton sellButton = new JButton("Sell Investment");
        sellButton.setFont(font);
        sellButton.setBackground(Color.CYAN);
        
        JButton updateButton = new JButton("Update Prices");
        updateButton.setFont(font);
        updateButton.setBackground(Color.CYAN);
        
        JButton getGainBtn = new JButton("Get Gain");
        getGainBtn.setFont(font);
        getGainBtn.setBackground(Color.CYAN);
        
        JButton saveAs = new JButton("Save");
        saveAs.setFont(font);
        saveAs.setBackground(Color.CYAN);
        
        JButton loadBtn = new JButton("Load");
        loadBtn.setFont(font);
        loadBtn.setBackground(Color.CYAN);
        
        JButton quitButton = new JButton("Quit");
        quitButton.setFont(font);
        quitButton.setBackground(Color.RED);
        
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.add(profileButton);
        topPanel.add(buyButton);
        topPanel.add(sellButton);
        topPanel.add(updateButton);
        topPanel.add(getGainBtn);
        
        topPanel.add(saveAs);
        topPanel.add(loadBtn);
        topPanel.add(quitButton);
        topPanel.setBorder(new EmptyBorder(10,10,10,10)); //Navigation Bar Code
        topPanel.setBackground(Color.black);
        
        JTextArea welcomeArea = new JTextArea(10,10);
        welcomeArea.setEditable(false);
        welcomeArea.setFont(font);
        welcomeArea.setText("\n                                                     Welcome to your Stock Management System.\n");
        welcomeArea.setLineWrap(true);
        welcomeArea.setWrapStyleWord(true); //Main Body Code
        
        welcomeArea.setBackground(Color.BLACK);
        welcomeArea.setForeground(Color.CYAN);

        JPanel buyPanelOutput = new JPanel();       
        buyPanelOutput.setBorder(new EmptyBorder(10,0,0,5));
        buyPanelOutput.setLayout(new BoxLayout(buyPanelOutput, BoxLayout.Y_AXIS));
        buyPanelOutput.setBackground(Color.black);
        buyPanelOutput.setBorder(new EmptyBorder(10, 0, 0, 0));
        JTextArea messageArea = new JTextArea(10,10);
        messageArea.setBorder(new EmptyBorder(10,10,10,10));
        messageArea.setEditable(false);
        messageArea.setFont(font);
        messageArea.setBackground(Color.black);
        JLabel msgLbl = new JLabel("                     Messages");
        msgLbl.setFont(font);
        msgLbl.setBackground(Color.BLACK);
        msgLbl.setForeground(Color.CYAN);
        msgLbl.setBorder(new EmptyBorder(10,0,0,0));
        JScrollPane scroll = new JScrollPane(messageArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                             JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        buyPanelOutput.add(msgLbl);
        buyPanelOutput.add(scroll);
        
        JPanel sellPanelOutput = new JPanel();
        sellPanelOutput.setBorder(new EmptyBorder(10,0,0,0));
        sellPanelOutput.setLayout(new BoxLayout(sellPanelOutput, BoxLayout.Y_AXIS));
        sellPanelOutput.setBackground(Color.BLACK);
        JTextArea sellMessageArea = new JTextArea(10,10);
        sellMessageArea.setBorder(new EmptyBorder(10,10,10,10));
        sellMessageArea.setEditable(false);
        sellMessageArea.setFont(font);
        sellMessageArea.setBackground(Color.black);
        JLabel sellMsgLbl = new JLabel("Messages");
        sellMsgLbl.setFont(font);
        sellMsgLbl.setForeground(Color.cyan);
        JScrollPane scroll2 = new JScrollPane(sellMessageArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                             JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sellPanelOutput.add(sellMsgLbl);
        sellPanelOutput.add(scroll2);
        
        JPanel updatePanelOutput = new JPanel();
        updatePanelOutput.setBorder(new EmptyBorder(10,0,0,0));
        updatePanelOutput.setLayout(new BoxLayout(updatePanelOutput, BoxLayout.Y_AXIS));
        updatePanelOutput.setBackground(Color.BLACK);
        JTextArea updateMessageArea = new JTextArea(10,10);
        updateMessageArea.setBorder(new EmptyBorder(10,10,10,10));
        updateMessageArea.setEditable(false);
        updateMessageArea.setFont(font);
        updateMessageArea.setBackground(Color.black);
        JLabel updateMsgLbl = new JLabel("Messages");
        updateMsgLbl.setFont(font);
        updateMsgLbl.setForeground(Color.CYAN);
        JScrollPane scroll3 = new JScrollPane(updateMessageArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                              JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        updatePanelOutput.add(updateMsgLbl);
        updatePanelOutput.add(scroll3);
        
        JPanel getGainOutput = new JPanel();
        getGainOutput.setBorder(new EmptyBorder(10,0,0,0));
        getGainOutput.setLayout(new BoxLayout(getGainOutput, BoxLayout.Y_AXIS));
        getGainOutput.setBackground(Color.BLACK);
        JTextArea getGainMsgArea = new JTextArea(10,10);
        getGainMsgArea.setBorder(new EmptyBorder(10,10,10,10));
        getGainMsgArea.setEditable(false);
        getGainMsgArea.setFont(font);
        getGainMsgArea.setBackground(Color.BLACK);
        JLabel getGainLbl = new JLabel("Individual Gains");
        getGainLbl.setFont(font);
        getGainLbl.setForeground(Color.CYAN);
        JScrollPane scroll4 = new JScrollPane(getGainMsgArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                              JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        getGainOutput.add(getGainLbl);
        getGainOutput.add(scroll4);
        
        JPanel profileResults = new JPanel();
        profileResults.setBorder(new EmptyBorder(10,0,0,0));
        profileResults.setLayout(new BoxLayout(profileResults, BoxLayout.Y_AXIS));
        profileResults.setBackground(Color.BLACK);
        
        
        
        String imagePath = "C:\\Users\\Harsh\\OneDrive\\Desktop\\graph.jpg"; // Storing image path in a variable
        ImageIcon profileImageIcon = new ImageIcon(imagePath); 
        JLabel profileImageLabel = new JLabel(profileImageIcon);  // Add image to a label
        profileResults.add(profileImageLabel, BorderLayout.CENTER); //RISHI+HARSH ADDED
        ///////////////////////////////////////////////////////////////////////// MODIFIED BY HARSH
        JPanel buyPanelWrapper = new JPanel();
        buyPanelWrapper.setLayout(new BorderLayout());

        JPanel buyPanel = new JPanel();
        buyPanel.setLayout(new GridLayout(1, 2));

        JLabel buyLbl = new JLabel("Buying an investment");
        buyLbl.setFont(font);

        JLabel typeLbl = new JLabel("Type: ");
        typeLbl.setFont(font);

        JLabel symbolLbl = new JLabel("Symbol: ");
        symbolLbl.setFont(font);

        JLabel nameLbl = new JLabel("Name: ");
        nameLbl.setFont(font);

        JLabel quantityLbl = new JLabel("Quantity: ");
        quantityLbl.setFont(font);

        JLabel priceLbl = new JLabel("Price: ");
        priceLbl.setFont(font);

        String[] types = new String[2];
        types[0] = "Stock";
        types[1] = "Mutual Fund";

        JComboBox typeFld = new JComboBox(types);
        typeFld.setFont(font);

        JTextField symbolFld = new JTextField(30);
        symbolFld.setFont(font);

        JTextField nameFld = new JTextField(30);
        nameFld.setFont(font);

        JTextField quantityFld = new JTextField(30);
        quantityFld.setFont(font);

        JTextField priceFld = new JTextField(30);
        priceFld.setFont(font);

        JPanel buyForm = new JPanel();
        buyForm.setBorder(new EmptyBorder(10, 0, 0, 0));
        buyForm.setLayout(new GridLayout(5, 2));
        buyForm.add(typeLbl);
        buyForm.add(typeFld);
        buyForm.add(symbolLbl);
        buyForm.add(symbolFld);
        buyForm.add(nameLbl);
        buyForm.add(nameFld);
        buyForm.add(quantityLbl);
        buyForm.add(quantityFld);
        buyForm.add(priceLbl);
        buyForm.add(priceFld);

        JPanel buyFormWrapper = new JPanel();
        buyFormWrapper.setLayout(new BorderLayout());
        buyFormWrapper.add(buyLbl, BorderLayout.NORTH);
        buyFormWrapper.add(buyForm, BorderLayout.SOUTH);
        buyFormWrapper.setBorder(new EmptyBorder(10, 10, 0, 10));

        JPanel buyPanelRight = new JPanel();
        buyPanelRight.setLayout(new BorderLayout());

        JPanel buyPanelButtons = new JPanel();
        buyPanelButtons.setLayout(new BoxLayout(buyPanelButtons, BoxLayout.Y_AXIS));

        JButton resetBuyBtn = new JButton("Reset");
        resetBuyBtn.setFont(font);

        JButton buyBtn = new JButton("Buy");
        buyBtn.setFont(font);

        buyPanelButtons.add(resetBuyBtn);
        buyPanelButtons.add(buyBtn);
        buyPanelRight.add(buyPanelButtons, BorderLayout.SOUTH);

        buyPanel.add(buyFormWrapper);
        buyPanel.add(buyPanelRight);
        buyPanelWrapper.add(buyPanel, BorderLayout.NORTH);
        buyPanelWrapper.add(buyPanelOutput, BorderLayout.CENTER);
        
        buyPanelWrapper.setBackground(Color.BLACK);
        buyPanel.setBackground(Color.BLACK);
        buyLbl.setForeground(Color.CYAN);
        typeLbl.setForeground(Color.CYAN);
        symbolLbl.setForeground(Color.CYAN);
        nameLbl.setForeground(Color.CYAN);
        quantityLbl.setForeground(Color.CYAN);
        priceLbl.setForeground(Color.CYAN);
        typeFld.setBackground(Color.darkGray);
        typeFld.setForeground(Color.white);
        symbolFld.setBackground(Color.darkGray);
        symbolFld.setForeground(Color.white);
        nameFld.setBackground(Color.darkGray);
        nameFld.setForeground(Color.CYAN);
        quantityFld.setBackground(Color.darkGray);
        quantityFld.setForeground(Color.white);
        priceFld.setBackground(Color.darkGray);
        priceFld.setForeground(Color.white);
        buyForm.setBackground(Color.BLACK);
        buyFormWrapper.setBackground(Color.BLACK);
        buyPanelRight.setBackground(Color.BLACK);
        buyPanelButtons.setBackground(Color.BLACK);
        resetBuyBtn.setBackground(Color.DARK_GRAY);
        resetBuyBtn.setForeground(Color.CYAN);
        buyBtn.setBackground(Color.DARK_GRAY);
        buyBtn.setForeground(Color.CYAN);

               
        ///////////////////////////SELL Window //////////////////////////////////
        JPanel sellPanelWrapper = new JPanel();
        sellPanelWrapper.setLayout(new BorderLayout());

        JPanel sellPanel = new JPanel();
        sellPanel.setLayout(new GridLayout(1, 2));

        JLabel sellLbl = new JLabel("Selling an investment", JLabel.CENTER);
        sellLbl.setFont(font);

        JTextField sellSymbolFld = new JTextField(30);
        sellSymbolFld.setFont(font);

        JTextField sellQuantityFld = new JTextField(30);
        sellQuantityFld.setFont(font);

        JTextField sellPriceFld = new JTextField(30);
        sellPriceFld.setFont(font);

        JLabel sellSymbolLbl = new JLabel("Symbol: ", JLabel.CENTER);
        sellSymbolLbl.setFont(font);

        JLabel sellQuantityLbl = new JLabel("Quantity: ", JLabel.CENTER);
        sellQuantityLbl.setFont(font);

        JLabel sellPriceLbl = new JLabel("Price: ", JLabel.CENTER);
        sellPriceLbl.setFont(font);

        JPanel sellForm = new JPanel();
        sellForm.setLayout(new GridLayout(3, 2));
        sellForm.setBorder(new EmptyBorder(10, 0, 0, 0));
        sellForm.add(sellSymbolLbl);
        sellForm.add(sellSymbolFld);
        sellForm.add(sellQuantityLbl);
        sellForm.add(sellQuantityFld);
        sellForm.add(sellPriceLbl);
        sellForm.add(sellPriceFld);

        JPanel sellFormWrapper = new JPanel();
        sellFormWrapper.setLayout(new BorderLayout());
        sellFormWrapper.add(sellLbl, BorderLayout.NORTH);
        sellFormWrapper.add(sellForm, BorderLayout.SOUTH);
        sellFormWrapper.setBorder(new EmptyBorder(10, 10, 0, 10));

        JPanel sellPanelRight = new JPanel();
        sellPanelRight.setLayout(new BorderLayout());

        JPanel sellPanelButtons = new JPanel();
        sellPanelButtons.setLayout(new BoxLayout(sellPanelButtons, BoxLayout.Y_AXIS));

        JButton resetSellBtn = new JButton("Reset");
        resetSellBtn.setFont(font);

        JButton sellBtn = new JButton("Sell");
        sellBtn.setFont(font);

        sellPanelButtons.add(resetSellBtn);
        sellPanelButtons.add(sellBtn);
        sellPanelRight.add(sellPanelButtons, BorderLayout.SOUTH);

        sellPanel.add(sellFormWrapper);
        sellPanel.add(sellPanelRight);

        sellPanelWrapper.add(sellPanel, BorderLayout.NORTH);
        sellPanelWrapper.add(sellPanelOutput, BorderLayout.CENTER);

        sellPanel.setBackground(Color.BLACK);
        sellLbl.setForeground(Color.CYAN);
        sellSymbolFld.setBackground(Color.darkGray);
        sellSymbolFld.setForeground(Color.CYAN);
        sellQuantityFld.setBackground(Color.darkGray);
        sellQuantityFld.setForeground(Color.CYAN);
        sellPriceFld.setBackground(Color.darkGray);
        sellPriceFld.setForeground(Color.CYAN);
        sellSymbolLbl.setForeground(Color.CYAN);
        sellQuantityLbl.setForeground(Color.CYAN);
        sellPriceLbl.setForeground(Color.CYAN);
        sellForm.setBackground(Color.BLACK);
        sellFormWrapper.setBackground(Color.BLACK);
        sellPanelRight.setBackground(Color.BLACK);
        sellPanelButtons.setBackground(Color.BLACK);
        resetSellBtn.setBackground(Color.darkGray);
        resetSellBtn.setForeground(Color.CYAN);
        sellBtn.setBackground(Color.darkGray);
        sellBtn.setForeground(Color.CYAN);
        sellPanel.setBackground(Color.BLACK);

        
        /// UPDATE Window
        JPanel updatePanelWrapper = new JPanel();
        updatePanelWrapper.setLayout(new BorderLayout());
        JPanel updatePanel = new JPanel();
        updatePanel.setLayout(new GridLayout(1,2));

        JLabel updateLbl = new JLabel("Updating investments");
        updateLbl.setFont(font);
        JTextField updateSymbolFld = new JTextField(30);
        updateSymbolFld.setEditable(false);
        updateSymbolFld.setFont(font);

        JTextField updateNameFld = new JTextField(30);
        updateNameFld.setEditable(false);
        updateNameFld.setFont(font);

        JTextField updatePriceFld = new JTextField(30);
        updatePriceFld.setFont(font);

        JLabel updateSymbolLbl = new JLabel("Symbol: ");
        updateSymbolLbl.setFont(font);
        JLabel updateNameLbl = new JLabel("Name: ");
        updateNameLbl.setFont(font);
        JLabel updatePriceLbl = new JLabel("Price: ");
        updatePriceLbl.setFont(font);
        JPanel updateForm = new JPanel();
        updateForm.setBorder(new EmptyBorder(10,0,0,0));
        updateForm.setLayout(new GridLayout(3,2));
        updateForm.add(updateSymbolLbl);
        updateForm.add(updateSymbolFld);
        updateForm.add(updateNameLbl);
        updateForm.add(updateNameFld);
        updateForm.add(updatePriceLbl);
        updateForm.add(updatePriceFld);

        JPanel updateFormWrapper = new JPanel();
        updateFormWrapper.setLayout(new BorderLayout());
        updateFormWrapper.add(updateLbl, BorderLayout.NORTH);
        updateFormWrapper.add(updateForm, BorderLayout.SOUTH);
        updateFormWrapper.setBorder(new EmptyBorder(10,10,0,10));

        JPanel updatePanelRight = new JPanel();
        updatePanelRight.setLayout(new BorderLayout());

        JPanel updatePanelButtons = new JPanel();
        updatePanelButtons.setLayout(new BoxLayout(updatePanelButtons, BoxLayout.Y_AXIS));

        JButton prevButton = new JButton("Prev");
        prevButton.setFont(font);
        JButton nextButton = new JButton("Next");
        nextButton.setFont(font);
        JButton updateSaveButton = new JButton("Save");
        updateSaveButton.setFont(font);

        updatePanelButtons.add(prevButton);
        updatePanelButtons.add(nextButton);
        updatePanelButtons.add(updateSaveButton);
        
        updatePanelRight.add(updatePanelButtons, BorderLayout.SOUTH);
        updatePanel.add(updateFormWrapper);
        updatePanel.add(updatePanelRight);
        
        updatePanelWrapper.add(updatePanel, BorderLayout.NORTH);
        updatePanelWrapper.add(updatePanelOutput, BorderLayout.CENTER);
        
        updatePanelWrapper.setBackground(Color.BLACK);
        updateLbl.setForeground(Color.cyan);
        updateSymbolFld.setBackground(Color.darkGray);
        updateSymbolFld.setForeground(Color.white);
        updateNameFld.setBackground(Color.darkGray);
        updateNameFld.setForeground(Color.white);
        updatePriceFld.setBackground(Color.darkGray);
        updatePriceFld.setForeground(Color.white);
        updateSymbolLbl.setForeground(Color.cyan);
        updateNameLbl.setForeground(Color.cyan);
        updatePriceLbl.setForeground(Color.cyan);
        updateForm.setBackground(Color.black);
        updateFormWrapper.setBackground(Color.black);
        updatePanelRight.setBackground(Color.black);
        updatePanelButtons.setBackground(Color.black);
        prevButton.setBackground(Color.DARK_GRAY);
        prevButton.setForeground(Color.cyan);
        nextButton.setBackground(Color.darkGray);
        nextButton.setForeground(Color.cyan);
        updateSaveButton.setBackground(Color.darkGray);
        updateSaveButton.setForeground(Color.cyan);

        //////////////////////////GET GAIN Window ///////////////////////////
        JPanel getGainPanelWrapper = new JPanel();
        getGainPanelWrapper.setLayout(new BorderLayout());
        
        JPanel getGainPanel = new JPanel();
        JLabel getGainHeading = new JLabel("Getting total gain");
        getGainHeading.setFont(font);
        JLabel totalGainLbl = new JLabel("Total gain: ");
        totalGainLbl.setFont(font);
        
        JTextField getGainFld = new JTextField(20);
        getGainFld.setEditable(false);
        getGainFld.setFont(font);
        
        JPanel getGainForm = new JPanel();
        getGainForm.setBorder(new EmptyBorder(10,0,0,0));
        getGainForm.setLayout(new BoxLayout(getGainForm, BoxLayout.X_AXIS));
        getGainForm.add(totalGainLbl);
        getGainForm.add(getGainFld);
        
        JPanel getGainFormWrapper = new JPanel();
        getGainFormWrapper.setLayout(new BorderLayout());
        getGainFormWrapper.add(getGainHeading, BorderLayout.NORTH);
        getGainFormWrapper.add(getGainForm, BorderLayout.SOUTH);
        getGainFormWrapper.setBorder(new EmptyBorder(10,10,0,10));
        
        getGainPanel.add(getGainFormWrapper);
        getGainPanelWrapper.add(getGainPanel, BorderLayout.NORTH);
        getGainPanelWrapper.add(getGainOutput, BorderLayout.CENTER);
        // Setting background and foreground color
        updatePanelWrapper.setBackground(Color.black);
        getGainHeading.setForeground(Color.cyan);
        totalGainLbl.setForeground(Color.cyan);
        getGainFld.setBackground(Color.darkGray);
        getGainFld.setForeground(Color.white);
        getGainPanel.setBackground(Color.black);
        getGainFormWrapper.setBackground(Color.black);
        getGainForm.setBackground(Color.black);
        getGainForm.setForeground(Color.cyan);
        
        
        ////////////////////////////////////Profile Window /////////////////////////////////
        JPanel profilePanel = new JPanel();
        
        JPanel profilePanelWrapper = new JPanel();
        profilePanelWrapper.setLayout(new BorderLayout());
        profilePanelWrapper.add(profileResults, BorderLayout.CENTER);
        profilePanelWrapper.setBackground(Color.black);
        
        profilePanel.setBackground(Color.black);
        
        
        ////////////////////////// content panel declaration ////////////////////
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new CardLayout());
        
        bottomPanel.add(welcomeArea, "welcomeScreen");
        bottomPanel.add(buyPanelWrapper, "buyPanel");
        bottomPanel.add(sellPanelWrapper, "sellPanel");
        bottomPanel.add(updatePanelWrapper, "updatePanel");
        bottomPanel.add(getGainPanelWrapper, "getGainPanel");
        bottomPanel.add(profilePanelWrapper, "profilePanel");
        ((CardLayout) bottomPanel.getLayout()).show(bottomPanel, "welcomeScreen");
        
        add(topPanel);
        add(bottomPanel);
        
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                messageArea.setText("");
                ((CardLayout) bottomPanel.getLayout()).show(bottomPanel, "buyPanel");
            }
        });
        
        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sellMessageArea.setText("");
                ((CardLayout) bottomPanel.getLayout()).show(bottomPanel, "sellPanel");
            }
        });
        
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!Stock_Management.portfolio.getInvestmentList().isEmpty()) {
                    index = 0;
                    Investment_Type i = Stock_Management.portfolio.getInvestmentList().get(index);
                    updateSymbolFld.setText(i.getSymbol());
                    updateNameFld.setText(i.getName());
                    updatePriceFld.setText("" + i.getPrice());
                    updateMessageArea.setText("");
                }
                ((CardLayout) bottomPanel.getLayout()).show(bottomPanel, "updatePanel");
            }
        });
        
        getGainBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double totalGain = Stock_Management.portfolio.getGain(getGainMsgArea);
                String o = String.format("$%.2f", totalGain);
                getGainFld.setText(o);
                ((CardLayout) bottomPanel.getLayout()).show(bottomPanel, "getGainPanel");
            }
        });
        
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                ((CardLayout) bottomPanel.getLayout()).show(bottomPanel, "profilePanel");
            }
        });
        
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        buyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int type = typeFld.getSelectedIndex();
                String symbol = symbolFld.getText();
                String name = nameFld.getText();
                int quantity;
                double price;
                try {
                    price = Double.parseDouble(priceFld.getText());
                    quantity = Integer.parseInt(quantityFld.getText());
                }
                catch (NumberFormatException e) {
                    messageArea.setText("Input Error: NumberFormatException");
                    return;
                }
                int result = Stock_Management.portfolio.buyInvestment(type, symbol, name, quantity, price, messageArea);
                if (result != Stock_Management.SUCCESS)
                    messageArea.setText(Stock_Management.getError(result));
                else {
                    symbolFld.setText("");
                    nameFld.setText("");
                    quantityFld.setText("");
                    priceFld.setText("");
                }
            }
        });
        
        resetBuyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                symbolFld.setText("");
                nameFld.setText("");
                quantityFld.setText("");
                priceFld.setText("");
            }
        });
        
        sellBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String symbol = sellSymbolFld.getText();
                int quantity;
                double price;
                try {
                    price = Double.parseDouble(sellPriceFld.getText());
                    quantity = Integer.parseInt(sellQuantityFld.getText());
                }
                catch (NumberFormatException e) {
                    sellMessageArea.setText("Input Error: NumberFormatException");
                    return;
                }
                int result = Stock_Management.portfolio.sellInvestment(symbol, quantity, price, sellMessageArea);
                if (result != Stock_Management.SUCCESS)
                    sellMessageArea.setText(Stock_Management.getError(result));
                 else {
                    sellSymbolFld.setText("");
                    sellQuantityFld.setText("");
                    sellPriceFld.setText("");
                }
            }
        });
        
        resetSellBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sellSymbolFld.setText("");
                sellQuantityFld.setText("");
                sellPriceFld.setText("");
            }
        });
        
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList investmentList = Stock_Management.portfolio.getInvestmentList();
                if (investmentList.isEmpty())
                    return;
                if (index + 1 > investmentList.size()-1)
                    return;
                index++;
                Investment_Type i = Stock_Management.portfolio.getInvestmentList().get(index);
                updateSymbolFld.setText(i.getSymbol());
                updateNameFld.setText(i.getName());
                updatePriceFld.setText("" + i.getPrice());
            }
        });
        
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList investmentList = Stock_Management.portfolio.getInvestmentList();
                if (investmentList.isEmpty())
                    return;
                if (index == 0)
                    return;
                index--;
                Investment_Type i = Stock_Management.portfolio.getInvestmentList().get(index);
                updateSymbolFld.setText(i.getSymbol());
                updateNameFld.setText(i.getName());
                updatePriceFld.setText("" + i.getPrice());
            }
        });
        
        updateSaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String symbol = updateSymbolFld.getText();
                double price;
                try {
                    price = Double.parseDouble(updatePriceFld.getText());
                    int result = Stock_Management.portfolio.updatePrice(symbol, price);
                    if (result != Stock_Management.SUCCESS)
                        updateMessageArea.setText(Stock_Management.getError(result));
                    else
                        updateMessageArea.setText("Successfully updated price for " + symbol);
                }
                catch (NumberFormatException ex) {
                    updateMessageArea.setText("Input Error: NumberFormatException");
                }
            }
        });
        
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showSaveDialog(null);
                if (fileChooser.getSelectedFile() != null) {
                    String filepath = fileChooser.getSelectedFile().getPath();
                    Stock_Management.portfolio.savePortfolio(filepath);
                }
            }
        });
        
        loadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(null);
                if (fileChooser.getSelectedFile() != null) {
                    String filepath = fileChooser.getSelectedFile().getPath();
                    Stock_Management.portfolio.loadPortfolio(filepath);
                }
            }
        });
    }
}
