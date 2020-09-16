package section_19_exercicio_resolvido.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String nome;
    private Date data;

    public LogEntry(String nome, Date data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry)) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(nome, logEntry.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
