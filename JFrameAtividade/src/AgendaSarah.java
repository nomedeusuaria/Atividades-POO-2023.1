
public class AgendaSarah implements Agenda{
    private Map<String, Contato> contatos;

    public AgendaSarah(){
        this.contatos = new HashMap<>();
    }

    public boolean cadastraContato(Strind nome, int dia, int mes){
        if(!contatos.containsKey(nome)){
            this.contatos.put(nome, new Contato(nome, dia, mes));
            return true;
        } else {
            return false;
        }
    }
}
