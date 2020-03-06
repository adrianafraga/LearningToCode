package com.qintess.banco.modelo;

public class Conta {

	private int agencia;
	private int numero;
	private double saldo;
	private double taxa = 0.30;
	
	private Cliente cliente;

	public Conta(int agencia, int numero, double saldoInicial, Cliente cliente) {
		setAgencia(agencia);
		setNumero(numero);
		setSaldo(saldoInicial);
		setCliente(cliente);
	}

	public void depositar (double deposito) {
		this.saldo += deposito;
	}
	
	public void sacar (double saque) {
		this.saldo -= (saque + taxa);
	}
	
	public void transferir (double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public void getConta() {
		
		System.out.println("CONTA " + this.getAgencia() + "-" + this.getNumero() 
		+ "----\nNome: " + cliente.getNome() + "\nCPF: " 
		+ cliente.getCpf() + "\nIdade: " + cliente.getIdade() + "\nEstado Civil: " 
		+ cliente.getEstadoCivil() + "\nEndere�o: " + cliente.getEndereco());
		
		System.out.printf("\nConta: %d-%d \nSaldo Atual: R$%.2f\n", this.getAgencia(), 
				this.getNumero(), this.getSaldo());
	}
	
	
}