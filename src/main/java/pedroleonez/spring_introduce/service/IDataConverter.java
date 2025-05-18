package pedroleonez.spring_introduce.service;

public interface IDataConverter {
    <T> T getData(String json, Class<T> clazz);
}
