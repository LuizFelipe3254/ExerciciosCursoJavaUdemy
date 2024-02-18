package exercicioDemo.Programa.entities;

import exercicioDemo.Programa.Exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyy");
    private Integer numeroDoQuarto;
    private Date dataDeEntrada;
    private Date dataDeSaida;

    public Reserva(Integer numeroDoQuarto, Date dataDeEntrada, Date dataDeSaida) throws DomainException {
        if (!dataDeSaida.after(dataDeEntrada)){
            throw new DomainException("A data de saída deve ser posterior à data de entrada!");
        }
        this.numeroDoQuarto = numeroDoQuarto;
        this.dataDeEntrada = dataDeEntrada;
        this.dataDeSaida = dataDeSaida;
    }

    public long duracao(){
        long diff = dataDeSaida.getTime() - dataDeEntrada.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public void atualizarDatas(Date dataEntrada, Date dataSaida) throws DomainException {
        Date now = new Date();
        if (dataDeSaida.before(now) || dataEntrada.before(now)){
            throw new DomainException("As datas de reserva para atualização devem ser datas futuras!");
        }
        if (!dataDeSaida.after(dataEntrada)){
            throw new DomainException("A data de saída deve ser posterior à data de entrada!");
        }
        this.dataDeEntrada = dataEntrada;
        this.dataDeSaida = dataSaida;
    }
    public String toString(){
        return String.format("Quarto %d, data de entrada: %s, data de saida: %s, %d noites",numeroDoQuarto, fmt.format(dataDeEntrada),  fmt.format(dataDeSaida), duracao());
    }
}
