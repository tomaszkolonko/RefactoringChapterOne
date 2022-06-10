package ch.sbb.codequality.workshop.movie.category;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtil {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final DefaultPrettyPrinter PRETTY_PRINTER;
    ;

    static {
        PRETTY_PRINTER = new DefaultPrettyPrinter();
        PRETTY_PRINTER.indentArraysWith(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
    }

    private JsonUtil() {
        // util
    }

    public static String writeAsJson(final Object objectToWrite) {
        try {
            return OBJECT_MAPPER.writer(PRETTY_PRINTER).writeValueAsString(objectToWrite);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Could not create json", e);
        }
    }
}
