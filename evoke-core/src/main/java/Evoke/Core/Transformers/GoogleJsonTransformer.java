package Evoke.Core.Transformers;

import com.google.gson.Gson;

/**
 * Created by lambeaux on 2/22/16.
 *
 */
public class GoogleJsonTransformer implements DataTransformer {
    private static GoogleJsonTransformer instance = null;
    private Gson gsonTransformer = null;

    protected GoogleJsonTransformer() {
        gsonTransformer = new Gson();
    }

    public static DataTransformer getInstance() {
        if (instance == null)
            instance = new GoogleJsonTransformer();
        return instance;
    }

    public String marshal(Object objToMarshal) {
        return gsonTransformer.toJson(objToMarshal);
    }

    public Object unmarshal(String objAsData, Class classOfObj) {
        return gsonTransformer.fromJson(objAsData, classOfObj);
    }
}
