package mx.examples.financials.api.contract;

public interface Mapper<From, To> {

    To map(From input);

}