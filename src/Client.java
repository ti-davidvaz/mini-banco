public class Client {
    private final String name;
    private final String cpf;
    private final Account account;

    public Account getAccount() {
        return account;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public Client(String name, String cpf, Account account) {
        this.name = name;
        this.cpf = cpf;
        this.account = account;


    }


}
