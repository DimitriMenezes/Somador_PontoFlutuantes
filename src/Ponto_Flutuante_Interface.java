import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Galileu
 */
public class Ponto_Flutuante_Interface extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * Creates new form NewJFrame
     */
    public Ponto_Flutuante_Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        BotaoSomar = new javax.swing.JButton();
        BotaoMultiplicar = new javax.swing.JButton();
        label_Num1 = new javax.swing.JLabel();
        Label_Num1 = new javax.swing.JLabel();
        text_Numero1 = new javax.swing.JTextField();
        text_Numero2 = new javax.swing.JTextField();
        label_Op = new javax.swing.JLabel();
        PainelTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        Painel1 = new javax.swing.JPanel();
        text_Expoente1 = new javax.swing.JTextField();
        text_Sinal1 = new javax.swing.JTextField();
        label_mantissa1 = new javax.swing.JLabel();
        text_Mantissa1 = new javax.swing.JTextField();
        label_Sinal1 = new javax.swing.JLabel();
        label_Expoente1 = new javax.swing.JLabel();
        Painel2 = new javax.swing.JPanel();
        text_Expoente2 = new javax.swing.JTextField();
        text_Sinal2 = new javax.swing.JTextField();
        label_Mantissa2 = new javax.swing.JLabel();
        text_Mantissa2 = new javax.swing.JTextField();
        label_sinal2 = new javax.swing.JLabel();
        label_Expoente2 = new javax.swing.JLabel();
        PainelResult = new javax.swing.JPanel();
        text_ExpoenteResult = new javax.swing.JTextField();
        text_SinalResult = new javax.swing.JTextField();
        lalbel_MantissaResult = new javax.swing.JLabel();
        text_MantissaResult = new javax.swing.JTextField();
        label_SinalResult = new javax.swing.JLabel();
        label_ExpoenteResult = new javax.swing.JLabel();
        text_ResultFinal = new javax.swing.JTextField();
        label_decimal = new javax.swing.JLabel();
        label_Represent1 = new javax.swing.JLabel();
        label_Represente2 = new javax.swing.JLabel();
        label_resultado = new javax.swing.JLabel();
        BotaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Somador e Multiplicador de Ponto Flutuante!");
        
        BotaoSomar.setText("Somar");
        BotaoSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSomarActionPerformed(evt);
            }
        });

        BotaoMultiplicar.setText("Multiplicar");
        BotaoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicarActionPerformed(evt);
            }
        });

        label_Num1.setText("N�mero 1");

        Label_Num1.setText("N�mero 2");

        text_Numero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        text_Numero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        label_Op.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Op.setText("Opera��es");

        PainelTitulo.setBackground(new java.awt.Color(153, 153, 153));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Somador e Multiplicador de Ponto Flutuante");

        javax.swing.GroupLayout PainelTituloLayout = new javax.swing.GroupLayout(PainelTitulo);
        PainelTitulo.setLayout(PainelTituloLayout);
        PainelTituloLayout.setHorizontalGroup(
            PainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelTituloLayout.setVerticalGroup(
            PainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo)
        );

        Painel1.setBackground(new java.awt.Color(204, 204, 204));

        text_Expoente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        text_Sinal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
     
        label_mantissa1.setText("Mantissa");

        text_Mantissa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_Sinal1.setText("Sinal");

        label_Expoente1.setText("Expoente");

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_Sinal1)
                    .addComponent(text_Sinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_Expoente1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(label_Expoente1)))
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(label_mantissa1))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_Mantissa1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_mantissa1)
                    .addComponent(label_Expoente1)
                    .addComponent(label_Sinal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_Sinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Expoente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Mantissa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        Painel2.setBackground(new java.awt.Color(204, 204, 204));

        text_Expoente2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        text_Sinal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_Mantissa2.setText("Mantissa");

        text_Mantissa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_sinal2.setText("Sinal");

        label_Expoente2.setText("Expoente");

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_sinal2)
                    .addComponent(text_Sinal2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_Expoente2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(label_Expoente2)))
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(label_Mantissa2))
                    .addGroup(Painel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_Mantissa2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Mantissa2)
                    .addComponent(label_Expoente2)
                    .addComponent(label_sinal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_Sinal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Expoente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Mantissa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        PainelResult.setBackground(new java.awt.Color(204, 204, 204));

        text_ExpoenteResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        text_SinalResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lalbel_MantissaResult.setText("Mantissa");

        text_MantissaResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_SinalResult.setText("Sinal");

        label_ExpoenteResult.setText("Expoente");

        text_ResultFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_decimal.setText("Representa��o em decimal");

        javax.swing.GroupLayout PainelResultLayout = new javax.swing.GroupLayout(PainelResult);
        PainelResult.setLayout(PainelResultLayout);
        PainelResultLayout.setHorizontalGroup(
            PainelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelResultLayout.createSequentialGroup()
                .addGroup(PainelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelResultLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PainelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_SinalResult)
                            .addComponent(text_SinalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelResultLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_ExpoenteResult, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelResultLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(label_ExpoenteResult)))
                        .addGroup(PainelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelResultLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lalbel_MantissaResult))
                            .addGroup(PainelResultLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_MantissaResult, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelResultLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(text_ResultFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelResultLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(label_decimal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelResultLayout.setVerticalGroup(
            PainelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelResultLayout.createSequentialGroup()
                .addGroup(PainelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lalbel_MantissaResult)
                    .addComponent(label_ExpoenteResult)
                    .addComponent(label_SinalResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_SinalResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_ExpoenteResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_MantissaResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(label_decimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_ResultFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        label_Represent1.setText("Representa��o do n�mero 1");

        label_Represente2.setText("Representa��o do n�mero 2");

        label_resultado.setText("Representa��o do RESULTADO");

        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(PainelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(label_Represente2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(label_resultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoLimpar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(label_Num1)
                                    .addGap(81, 81, 81)
                                    .addComponent(label_Op)
                                    .addGap(94, 94, 94)
                                    .addComponent(Label_Num1))
                                .addComponent(PainelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(text_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(BotaoSomar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BotaoMultiplicar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(text_Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(label_Represent1)))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PainelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Num1)
                    .addComponent(Label_Num1)
                    .addComponent(label_Op))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSomar)
                    .addComponent(BotaoMultiplicar))
                .addGap(26, 26, 26)
                .addComponent(label_Represent1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(label_Represente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(BotaoLimpar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    public void Zerar(){
    	text_Sinal1.setText("");
		text_Expoente1.setText("");
		text_Mantissa1.setText("");
		
		text_Sinal2.setText("");
		text_Expoente2.setText("");
		text_Mantissa2.setText("");
		
		text_SinalResult.setText("");
		text_ExpoenteResult.setText("");
		text_MantissaResult.setText("");
		
		text_ResultFinal.setText("");
    	
    }
   
    private void BotaoSomarActionPerformed(java.awt.event.ActionEvent evt) {
    	try{
    		float num1 = Float.parseFloat(text_Numero1.getText());
    		float num2 = Float.parseFloat(text_Numero2.getText());
	    	
    		PFlutuante x = new PFlutuante(num1);
			PFlutuante y = new PFlutuante(num2);		
	
			PFlutuante resultado = 	Somador.soma(x,y);
			
			if (x.getSinal() != y.getSinal()) throw new Exception();
			
			Zerar();
			
			text_Sinal1.setText(""+Integer.toBinaryString(x.getSinal()));
			text_Expoente1.setText(""+Integer.toBinaryString(x.getExpoente()));
			text_Mantissa1.setText(""+Long.toBinaryString(x.getMantissa()));
			
			text_Sinal2.setText(""+Integer.toBinaryString(y.getSinal()));
			text_Expoente2.setText(""+Integer.toBinaryString(y.getExpoente()));
			text_Mantissa2.setText(""+Long.toBinaryString(y.getMantissa()));
			
			text_SinalResult.setText(""+Integer.toBinaryString(resultado.getSinal()));
			text_ExpoenteResult.setText(""+Integer.toBinaryString(resultado.getExpoente()));
			text_MantissaResult.setText(""+Long.toBinaryString(resultado.getMantissa()));
			
			text_ResultFinal.setText(""+resultado.getNumero());
    	}catch (Exception e){
    		JOptionPane.showMessageDialog(null, "N�meros Digitados no formato incorreto!");
    	}
    }

    
    private void BotaoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {
    	try{
	    	PFlutuante x = new PFlutuante((float) Float.parseFloat(text_Numero1.getText()));
			PFlutuante y = new PFlutuante((float) Float.parseFloat(text_Numero2.getText()));		
	
			PFlutuante resultado = 	Multiplicador.multiplicacao(x, y);
			
			Zerar();
			
			text_Sinal1.setText(""+Integer.toBinaryString(x.getSinal()));
			text_Expoente1.setText(""+Integer.toBinaryString(x.getExpoente()));
			text_Mantissa1.setText(""+Long.toBinaryString(x.getMantissa()));
			
			text_Sinal2.setText(""+Integer.toBinaryString(y.getSinal()));
			text_Expoente2.setText(""+Integer.toBinaryString(y.getExpoente()));
			text_Mantissa2.setText(""+Long.toBinaryString(y.getMantissa()));
			
			text_SinalResult.setText(""+Integer.toBinaryString(resultado.getSinal()));
			text_ExpoenteResult.setText(""+Integer.toBinaryString(resultado.getExpoente()));
			text_MantissaResult.setText(""+Long.toBinaryString(resultado.getMantissa()));
			
			text_ResultFinal.setText(""+resultado.getNumero());
    	}catch (Exception e){
    		JOptionPane.showMessageDialog(null, "N�meros Digitados no formato incorreto!");
    	}
    }
    
    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {
    	text_Numero1.setText("");
    	text_Numero2.setText("");
    	Zerar();
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
            java.util.logging.Logger.getLogger(Ponto_Flutuante_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ponto_Flutuante_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ponto_Flutuante_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ponto_Flutuante_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ponto_Flutuante_Interface iniciar = new Ponto_Flutuante_Interface();
                iniciar.setVisible(true);
                iniciar.setLocation(450, 100);
                
                /**
                 * Para alterar os conte�dos, utiliza-se:
                 * iniciar.text_Sinal1.setText(valor a ser colocado);
                 * Ex.: iniciar.text_Sinal1.setText("1");
                */          
                
                //Deixando as caixas que mostram n�o edit�veis
                iniciar.text_Sinal1.setEditable(false);
                iniciar.text_Expoente1.setEditable(false);
                iniciar.text_Mantissa1.setEditable(false);
                                
                iniciar.text_Sinal2.setEditable(false);
                iniciar.text_Expoente2.setEditable(false);
                iniciar.text_Mantissa2.setEditable(false);
                                
                iniciar.text_SinalResult.setEditable(false);
                iniciar.text_ExpoenteResult.setEditable(false);
                iniciar.text_MantissaResult.setEditable(false);
                                
                iniciar.text_ResultFinal.setEditable(false);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoMultiplicar;
    private javax.swing.JButton BotaoSomar;
    private javax.swing.JLabel Label_Num1;
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel2;
    private javax.swing.JPanel PainelResult;
    private javax.swing.JPanel PainelTitulo;
    private javax.swing.JLabel label_Expoente1;
    private javax.swing.JLabel label_Expoente2;
    private javax.swing.JLabel label_ExpoenteResult;
    private javax.swing.JLabel label_Mantissa2;
    private javax.swing.JLabel label_Num1;
    private javax.swing.JLabel label_Op;
    private javax.swing.JLabel label_Represent1;
    private javax.swing.JLabel label_Represente2;
    private javax.swing.JLabel label_Sinal1;
    private javax.swing.JLabel label_SinalResult;
    private javax.swing.JLabel label_decimal;
    private javax.swing.JLabel label_mantissa1;
    private javax.swing.JLabel label_resultado;
    private javax.swing.JLabel label_sinal2;
    private javax.swing.JLabel lalbel_MantissaResult;
    private javax.swing.JTextField text_Expoente1;
    private javax.swing.JTextField text_Expoente2;
    private javax.swing.JTextField text_ExpoenteResult;
    private javax.swing.JTextField text_Mantissa1;
    private javax.swing.JTextField text_Mantissa2;
    private javax.swing.JTextField text_MantissaResult;
    private javax.swing.JTextField text_Numero1;
    private javax.swing.JTextField text_Numero2;
    private javax.swing.JTextField text_ResultFinal;
    private javax.swing.JTextField text_Sinal1;
    private javax.swing.JTextField text_Sinal2;
    private javax.swing.JTextField text_SinalResult;
    private javax.swing.JLabel titulo;
    // End of variables declaration
}
