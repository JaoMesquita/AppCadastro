package programa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class FrameCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdCliente;
	private JTextField txtNomeCliente;
	private JTextField txtEmailCliente;
	private JTextField txtIdadeCliente;
	private JTable tabelaCliente;
	private DefaultTableModel modelCliente;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnExcluir;
	private JButton btnEditar;
	private JButton btnFechar;
	
	/*
	 * array e um objeto para armazenar o meu cliente
	 * 
	 * */
	
	private static ArrayList<Cliente> listaClientes = new ArrayList<>();
	private static int proximoCLienteId = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCliente frame = new FrameCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameCliente() {
		setResizable(false);
		
		iniciarComponentes();
		
	}
	
	private void iniciarComponentes() {
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdCliente = new JLabel("Código\r\n");
		lblIdCliente.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblIdCliente.setBounds(83, 44, 73, 27);
		contentPane.add(lblIdCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtIdCliente.setEditable(false);
		txtIdCliente.setBounds(157, 44, 328, 27);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JLabel lblNomeCliente = new JLabel("Nome\r\n");
		lblNomeCliente.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNomeCliente.setBounds(83, 82, 73, 27);
		contentPane.add(lblNomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					txtEmailCliente.requestFocus();
				}
			}
		});
		txtNomeCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtNomeCliente.setColumns(10);
		txtNomeCliente.setBounds(157, 82, 328, 27);
		contentPane.add(txtNomeCliente);
		
		JLabel lblEmailCliente = new JLabel("Email");
		lblEmailCliente.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblEmailCliente.setBounds(83, 120, 73, 27);
		contentPane.add(lblEmailCliente);
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					txtIdadeCliente.requestFocus();
				}
			}
		});
		txtEmailCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtEmailCliente.setColumns(10);
		txtEmailCliente.setBounds(157, 120, 328, 27);
		contentPane.add(txtEmailCliente);
		
		JLabel lblIdadeCliente = new JLabel("Idade");
		lblIdadeCliente.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblIdadeCliente.setBounds(83, 158, 73, 27);
		contentPane.add(lblIdadeCliente);
		
		txtIdadeCliente = new JTextField();
		txtIdadeCliente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						btnSalvar.requestFocus();
					}
			}
		});
		txtIdadeCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txtIdadeCliente.setColumns(10);
		txtIdadeCliente.setBounds(157, 158, 328, 27);
		contentPane.add(txtIdadeCliente);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(74, 44, 73, 27);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNovo = new JButton("Novo");
		btnNovo.setMnemonic('N');
		btnNovo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		
		btnNovo.setBounds(23, 196, 101, 45);
		contentPane.add(btnNovo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(74, 82, 73, 27);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setBounds(74, 120, 73, 27);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.setBounds(74, 158, 73, 27);
		contentPane.add(panel_1_1_1);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnSalvar.setBounds(134, 196, 101, 45);
		contentPane.add(btnSalvar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnEditar.setBounds(245, 196, 101, 45);
		contentPane.add(btnEditar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnExcluir.setBounds(356, 196, 101, 45);
		contentPane.add(btnExcluir);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setMnemonic('X');
		btnFechar.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		btnFechar.setBounds(467, 196, 101, 45);
		contentPane.add(btnFechar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 252, 411, 112);
		contentPane.add(scrollPane);
		
		tabelaCliente = new JTable();
		String[] colunas = {"C\u00F3digo", "Nome", "Email", "Idade"};
		modelCliente = new DefaultTableModel(colunas, 0);
		tabelaCliente.setModel(modelCliente);
		tabelaCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		
		tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
		tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
		tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(50);
		
		scrollPane.setViewportView(tabelaCliente);
		
		
		
		
		setLocationRelativeTo(null);
		configurarNavegacao();
		configurarEventos();
	}
	
	
	
	private void configurarEventos() {
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novo();
			}
		});
		
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecharJanela();
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarCliente();
			}
		});
			
		
	}
	
	private void configurarNavegacao() {
		
	}
	
	private void novo(){
		limpaTextField();
		txtNomeCliente.requestFocus(); //para posicionar no canto que eu quiser
		JOptionPane.showMessageDialog(this, "Preencha os dados do Cliente e Clique em 'Salvar'.", "Novo Registro", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private boolean validarTextFieldCliente() {
		
		if (txtNomeCliente.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nome do cliente é obrigatório", "Erro de informação", JOptionPane.ERROR_MESSAGE);
			txtNomeCliente.requestFocus();
			return false;
		}
		if (txtEmailCliente.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "O email do cliente é obrigatório.", "Erro de informação", JOptionPane.ERROR_MESSAGE);
			txtEmailCliente.requestFocus();
			return false;
		}
		if (txtIdadeCliente.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "A idade do cliente é obrigatório.", "Erro de informação", JOptionPane.ERROR_MESSAGE);
			txtIdadeCliente.requestFocus();
			return false;
		}
		return true;
	}
	
	private void salvarCliente() {
		if (!validarTextFieldCliente()) {
			return;
		}
		try {
			Cliente cliente = new Cliente();
			cliente.setIdCliente(proximoCLienteId++);
			cliente.setNomeCliente(txtNomeCliente.getText());
			cliente.setEmailCliente(txtEmailCliente.getText());
			cliente.setIdadeCliente(Integer.parseInt(txtIdadeCliente.getText()));
			
			listaClientes.add(cliente);
			atualizarTabelaCliente();
			limpaTextField();
			JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			
			txtNomeCliente.requestFocus();
			
		}catch(NumberFormatException e ) {
			JOptionPane.showMessageDialog(this, "A idade do cliente deve ser um número válido.", "Erro de informação", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void limpaTextField(){
		txtIdCliente.setText("");
		txtNomeCliente.setText("");
		txtEmailCliente.setText("");
		txtIdadeCliente.setText("");
	}
	
	private void atualizarTabelaCliente() {
		// TODO Auto-generated method stub
		modelCliente.setRowCount(0);
		for (Cliente c : listaClientes) {
			Object[] registro = {
					c.getIdCliente(),
					c.getNomeCliente(),
					c.getEmailCliente(),
					c.getIdadeCliente()
			};
			modelCliente.addRow(registro);
		}
	}

	private void fecharJanela() {
		dispose(); //fecha a janela
	}
}
