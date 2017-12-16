/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Dany Lyth
 */
public class Calc extends javax.swing.JFrame {

    /**
     * Creates new form Calc
     */
    static String operation = " ";
    static BigInteger number = new BigInteger("0");

    public Calc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnPlusOrMinus = new javax.swing.JButton();
        btnOperate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        tfAnswer = new javax.swing.JTextField();
        lblErrorMessages = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnDot.setText(".");

        btnPlusOrMinus.setText("+/-");
        btnPlusOrMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusOrMinusActionPerformed(evt);
            }
        });

        btnOperate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOperate.setText("=");
        btnOperate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperateActionPerformed(evt);
            }
        });

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });

        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        tfAnswer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tfAnswer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnswerActionPerformed(evt);
            }
        });

        lblErrorMessages.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAnswer)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblErrorMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPlusOrMinus, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(btnMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOperate, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))))
                    .addComponent(lblNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlusOrMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnOperate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if (!tfAnswer.getText().equals("0")) {
            String answer = tfAnswer.getText();
            answer += "0";
            tfAnswer.setText(answer);
        }
    }                                    

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "1";
        } else {
            answer += "1";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "2";
        } else {
            answer += "2";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "3";
        } else {
            answer += "3";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "4";
        } else {
            answer += "4";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "5";
        } else {
            answer += "5";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "6";
        } else {
            answer += "6";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "7";
        } else {
            answer += "7";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "8";
        } else {
            answer += "8";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.equals("0")) {
            answer = "9";
        } else {
            answer += "9";
        }
        tfAnswer.setText(answer);
    }                                    

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        compute();
        String answer;
        if(!operation.equals(" ")) {
            answer = number.toString();
            tfAnswer.setText("0");
            lblNumber.setText(answer + " -");
            operation = "-";
        } else {
            answer = tfAnswer.getText();
            try {
                number = new BigInteger(answer);
                tfAnswer.setText("0");
                lblNumber.setText(answer + " -");
                operation = "-";
            } catch (NumberFormatException e) {
                tfAnswer.setText("0");
                lblNumber.setText("0 -");
                operation = "-";
            }
        }
    }                                           

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        compute();
        String answer;
        if(!operation.equals(" ")) {
            answer = number.toString();
            tfAnswer.setText("0");
            lblNumber.setText(answer + " +");
            operation = "+";
        } else {
            answer = tfAnswer.getText();
            try {
                number = new BigInteger(answer);
                tfAnswer.setText("0");
                lblNumber.setText(answer + " +");
                operation = "+";
            } catch (NumberFormatException e) {
                tfAnswer.setText("0");
                lblNumber.setText("0 +");
                operation = "+";
            }
        }
    }                                      

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        compute();
        String answer;
        if(!operation.equals(" ")) {
            answer = number.toString();
            tfAnswer.setText("0");
            lblNumber.setText(answer + " /");
            operation = "/";
        } else {
            answer = tfAnswer.getText();
            try {
                number = new BigInteger(answer);
                tfAnswer.setText("0");
                lblNumber.setText(answer + " /");
                operation = "/";
            } catch (NumberFormatException e) {
                tfAnswer.setText("0");
                lblNumber.setText("0 /");
                operation = "/";
            }
        }
    }                                         

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        compute();
        String answer;
        if(!operation.equals(" ")) {
            answer = number.toString();
            tfAnswer.setText("0");
            lblNumber.setText(answer + " *");
            operation = "*";
        } else {
            answer = tfAnswer.getText();
            try {
                number = new BigInteger(answer);
                tfAnswer.setText("0");
                lblNumber.setText(answer + " *");
                operation = "*";
            } catch (NumberFormatException e) {
                tfAnswer.setText("0");
                lblNumber.setText("0 *");
                operation = "*";
            }
        }
       
    }                                           

    private void btnPlusOrMinusActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        String answer = tfAnswer.getText();
        if (answer.isEmpty()) {
            answer = "-";
        } else {
            if (answer.charAt(0) == '-') {
                answer = answer.substring(1);
            } else {
                answer = "-" + answer;
            }
        }
        tfAnswer.setText(answer);
    }                                              

    private void btnOperateActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        compute();
    }                                          

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        tfAnswer.setText("");
        lblNumber.setText("");
        lblErrorMessages.setText("");
        number = BigInteger.ZERO;
        operation = " ";
    }                                        

    private void tfAnswerActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        compute();
    }                                        

    public void compute() {
        String answer = tfAnswer.getText();
        BigInteger number1;
        BigInteger number2;
        BigInteger toReturn;
        try {
            number2 = new BigInteger(answer);
            switch (operation) {
                case "+": {
                    toReturn = number.add(number2);
                    tfAnswer.setText(toReturn + "");
                    lblNumber.setText("");
                    break;
                }
                case "-": {
                    try {
                        number2 = new BigInteger(answer);
                    } catch (NumberFormatException e) {
                        number2 = BigInteger.ZERO;
                    }
                    toReturn = number.subtract(number2);
                    tfAnswer.setText(toReturn + "");
                    lblNumber.setText("");
                    break;
                }
                case "*": {
                    try {
                        number2 = new BigInteger(answer);
                    } catch (NumberFormatException e) {
                        number2 = BigInteger.ZERO;
                    }
                    toReturn = number.multiply(number2);
                    tfAnswer.setText(toReturn + "");
                    lblNumber.setText("");
                    break;
                }
                case "/": {
                    try {
                        number2 = new BigInteger(answer);
                    } catch (NumberFormatException e) {
                        number2 = BigInteger.ZERO;
                    }
                    try {
                        toReturn = number.divide(number2);
                        tfAnswer.setText(toReturn + "");
                    } catch (ArithmeticException e) {
                        lblErrorMessages.setText("<html><font color='red'>You cannot divide by zero.</font></html>");
                        tfAnswer.setText("");
                    } finally {
                        lblNumber.setText("");
                    }
                    break;
                }
                default: {

                }
            }
        } catch (NumberFormatException e) {
            if (answer.matches("[0-9]+[\\*|\\+|\\-|\\/][0-9]+")) {
                Scanner math = new Scanner(answer);
                if (answer.contains("*")) {
                    math.useDelimiter("\\*");
                    number1 = math.nextBigInteger();
                    number2 = math.nextBigInteger();
                    toReturn = number1.multiply(number2);
                    tfAnswer.setText(toReturn + "");
                } else if (answer.contains("+")) {
                    math.useDelimiter("\\+");
                    number1 = math.nextBigInteger();
                    number2 = math.nextBigInteger();
                    toReturn = number1.add(number2);
                    tfAnswer.setText(toReturn + "");
                } else if (answer.contains("-")) {
                    math.useDelimiter("\\-");
                    number1 = math.nextBigInteger();
                    number2 = math.nextBigInteger();
                    toReturn = number1.subtract(number2);
                    tfAnswer.setText(toReturn + "");
                } else if (answer.contains("/")) {
                    math.useDelimiter("\\/");
                    number1 = math.nextBigInteger();
                    number2 = math.nextBigInteger();
                    try {
                        toReturn = number1.divide(number2);
                        tfAnswer.setText(toReturn + "");
                    } catch (ArithmeticException d) {
                        lblErrorMessages.setText("<html><font color='red'>You cannot divide by zero.</font></html>");
                        tfAnswer.setText("");
                    } finally {
                        lblNumber.setText("");
                    }
                }
                lblNumber.setText("");
            } else {
                //lblErrorMessages.setText("<html><font color='red'>Your formula is not valid.</font></html>");
            }
        }
        number = BigInteger.ZERO;
        operation = " ";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnOperate;
    private javax.swing.JButton btnPlusOrMinus;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JLabel lblErrorMessages;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JTextField tfAnswer;
    // End of variables declaration                   
}
