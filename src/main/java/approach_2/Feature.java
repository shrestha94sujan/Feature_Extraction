package approach_2;

import java.util.List;

public class Feature{

    private ObjectModel objectModel;
    private String mappingStrategy;
    private String parentMappingStrategy;
    private List<String> associations;
    private boolean paretoOptimal;

    public Feature() {
    }

    public Feature(ObjectModel objectModel, String mappingStrategy, String parentMappingStrategy, List<String> associations, boolean paretoOptimal) {
        this.objectModel = objectModel;
        this.mappingStrategy = mappingStrategy;
        this.parentMappingStrategy = parentMappingStrategy;
        this.associations = associations;
        this.paretoOptimal = paretoOptimal;
    }

    public ObjectModel getObjectModel() {
        return objectModel;
    }

    public void setObjectModel(ObjectModel objectModel) {
        this.objectModel = objectModel;
    }

    public String getMappingStrategy() {
        return mappingStrategy;
    }

    public void setMappingStrategy(String mappingStrategy) {
        this.mappingStrategy = mappingStrategy;
    }

    public String getParentMappingStrategy() {
        return parentMappingStrategy;
    }

    public void setParentMappingStrategy(String parentMappingStrategy) {
        this.parentMappingStrategy = parentMappingStrategy;
    }

    public boolean isParetoOptimal() {
        return paretoOptimal;
    }

    public void setParetoOptimal(boolean paretoOptimal) {
        this.paretoOptimal = paretoOptimal;
    }

    public List<String> getAssociations() {
        return associations;
    }

    public void setAssociations(List<String> associations) {
        this.associations = associations;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "objectModel=" + objectModel +
                ", mappingStrategy='" + mappingStrategy + '\'' +
                ", parentMappingStrategy='" + parentMappingStrategy + '\'' +
                ", associations=" + associations +
                ", paretoOptimal=" + paretoOptimal +
                '}';
    }
}
