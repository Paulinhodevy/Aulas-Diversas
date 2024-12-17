public class Boleto extends BaseDomainAuditoria {

    Long id;
    String cdIspBancoString;

    String cnpjSacdr;
    
    String cnpjSacdr;

    String identcSacadrAvalst;

    LocalDate dtEmsBoleto;

    LocalDate dtVencBoleto;

    Float vlrBoleto;

    public static Builder builder(){return new builder();}

    public static RowMapper<Boleto> rowMaapper() {
        return (ResultSet rs, int rowNum) -> Boleto.builder()
    }
}




  
Copiar código
if (file.getParentFile() != null && !file.getParentFile().exists()) {
    file.getParentFile().mkdirs();
}
Linha(s): Entre as linhas 73 e 76 (baseado na sua imagem), alterei para adicionar a verificação file.getParentFile() != null.

2. Substituição do bloco try padrão por try-with-resources:
java
Copiar código
try (FileWriter writer = new FileWriter(file);
     CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)) {
    // código dentro do try permanece o mesmo
}
Linha(s): Alteração entre as linhas 78 e 80. Usei o try-with-resources para o fechamento automático do FileWriter e CSVPrinter.

3. Remoção dos métodos manuais de fechamento:
java
Copiar código
// csvPrinter.flush(); // REMOVIDO
// csvPrinter.close(); // REMOVIDO
Linha(s): As chamadas para csvPrinter.flush() e csvPrinter.close() foram removidas nas linhas 91 e 92, já que o try-with-resources cuida disso automaticamente.