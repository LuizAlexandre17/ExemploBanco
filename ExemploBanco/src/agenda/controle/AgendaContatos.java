package agenda.controle;

import agenda.exception.AgendaException;
import agenda.modelo.Pessoa;
import java.util.ArrayList;

/**
 * A classe AgendaContatos representa uma agenda de contatos, mantendo uma lista interna
 *   de contatos com informacoes sobre o nome completo, endereco e telefone de contato.
 *
 * @see Pessoa
 *
 */
public class AgendaContatos {

    //
    private ArrayList<Pessoa> contatos;

    //1. deve ser utilizado este atributo DAO para realizar o acesso ao banco de dados
    //2. Não deve ser aberto nesta classe uma conexão direta com o banco de dados
    private AgendaContatosDao dao = new AgendaContatosDao();



    /**
     * Cria uma nova agenda de contatos.
     */
    public AgendaContatos() {
        //utilizar o método dao.getAll() para retornar todas as pessoas do banco de dados
        contatos = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getContatos() {
        return contatos;
    }

    /**
     * Recupera a quantidade de contatos armazenados na agenda de contatos.
     */
    public int qtdadeContatos() {
        return contatos.size();
    }

    /**
     * Adiciona um novo contato na agenda de contatos.
     *
     * @param contato Referencia (objeto) para uma pessoa
     */
    public void adicionar(Pessoa contato) throws AgendaException {
        for( Pessoa p : this.contatos ) {
            if( contato.getNome() == null ) {
                throw new AgendaException("A inclusao do nome e obrigatoria. ");
            }
            if( contato.getTelefone() == null ) {
                throw new AgendaException("A inclusao do telefone e obrigatoria. ");
            }
            if( contato.getNome().equals(p.getNome()) ) {
                throw new AgendaException("Ja existe um contato com o nome especificado: " + contato.getNome());
            }
        }

        //deve ser verifado se a pessoa (contato) já esta cadatrado no banco, de estiver
        //executa-se o comando UPDADE a partir do DAO caso contrário o INSERT
        contatos.add(contato);
    }

    /**
     * Remove um contato com base na posicao informada como parametro.
     *
     * @param posicao Posicao do contato
     */
    public void remover(int posicao) throws AgendaException {
        // Verifica se posicao e valida
        if ((posicao >= 0) && (posicao < contatos.size())) {
            // Remove contato
            contatos.remove(posicao);

            //deve ser executado o comando DELETE no banco de dados

        } else {
            throw new AgendaException("Posicao ( " + posicao + " ) invalida.");
        }
    }

}