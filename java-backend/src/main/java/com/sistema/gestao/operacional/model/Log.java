package sistema.gestao.operacional.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "logs")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acao;

    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "demanda_id")
    private Demanda demanda;

    public Log() {}

    public Log(String acao, LocalDateTime dataHora, Usuario usuario, Demanda demanda) {
        this.acao = acao;
        this.dataHora = dataHora;
        this.usuario = usuario;
        this.demanda = demanda;
    }

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getAcao() {
        return acao;
    }
    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Demanda getDemanda() {
        return demanda;
    }
    public void setDemanda(Demanda demanda) {
        this.demanda = demanda;
    }
}
