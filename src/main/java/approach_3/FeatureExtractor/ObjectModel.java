package approach_3.FeatureExtractor;

public class ObjectModel {

    private String object;
    private int attributes;
    private ObjectModel parent;
    private int parents;
    private int children;
    private int srcOneToRelation;
    private int srcManyToRelation;
    private int dstToManyRelation;


    public ObjectModel(String object) {
        this.object = object;
        this.children = 0;
        this.parent = null;
        this.parents = 0;
        this.srcOneToRelation = 0;
        this.srcManyToRelation = 0;
        this.dstToManyRelation = 0;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getAttributes() {
        return attributes;
    }

    public void setAttributes(int attributes) {
        this.attributes = attributes;
    }

    public ObjectModel getParent() {
        return parent;
    }

    public void setParent(ObjectModel parent) {
        this.parent = parent;
    }

    public int getParents() {
        return parents;
    }

    public void setParents(int parents) {
        this.parents = parents;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getSrcOneToRelation() {
        return srcOneToRelation;
    }

    public void setSrcOneToRelation(int srcOneToRelation) {
        this.srcOneToRelation = srcOneToRelation;
    }

    public int getSrcManyToRelation() {
        return srcManyToRelation;
    }

    public void setSrcManyToRelation(int srcManyToRelation) {
        this.srcManyToRelation = srcManyToRelation;
    }

    public int getDstToManyRelation() {
        return dstToManyRelation;
    }

    public void setDstToManyRelation(int dstToManyRelation) {
        this.dstToManyRelation = dstToManyRelation;
    }

    @Override
    public String toString() {
        return "ObjectModel{" +
                "object='" + object + '\'' +
                ", attributes=" + attributes +
                ", parent=" + parent +
                ", parents=" + parents +
                ", children=" + children +
                ", srcOneToRelation=" + srcOneToRelation +
                ", srcManyToRelation=" + srcManyToRelation +
                ", dstToManyRelation=" + dstToManyRelation +
                '}';
    }
}
