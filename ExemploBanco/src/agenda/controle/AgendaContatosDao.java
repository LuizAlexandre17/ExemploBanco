package agenda.controle;

import agenda.exception.AgendaException;
import agenda.modelo.Pessoa;
import java.util.ArrayList;


/*
1. Esta classe deve implementar apenas recursos relacionados ao acesso ao banco de dados.
2. Não deve ser utilizado nenhum recurso da camada de apresentação, como por exemplo JOptionPane. 
   Para apresentar mensagens para os usuário utilize a exception AgendaException que deve ser
   tratada na classe AgendaContados
4. Esta classe deve utilizar o objeto agenda.controle.Conexao para obter acesso ao banco de dados.
DAO = Data Access Object
 */
public class AgendaContatosDao {

    /**Implementar a funcionalidade para inserir uma pessoa no banco de dados*/
    public void insert(Pessoa p) throws AgendaException {
    }

    /**Implementar a funcionalidade para atualizar uma pessoa no banco de dados*/
    public void update(Pessoa p) throws AgendaException {
    }

    /**Implementar a funcionalidade para excluir uma pessoa no banco de dados*/
    public void delete(Pessoa p) throws AgendaException {
    }

    /**Implementar a funcionalidade para verificar se a pessoa informa existe no banco de dados*/
    public boolean exists(Pessoa p) throws AgendaException {
        return false;
    }

    /**Implementar a funcionalidade para retornar todas as pessoas do banco de dados*/
    public ArrayList<Pessoa> getAll() throws AgendaException {
        return null;
    }
}
