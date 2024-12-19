package edu.fudan.rosefinch.factory;

// 静态工厂类
public class MyObjectFactory {
    public static MyObject getObjectCase(ObjectType type) {
        switch (type) {
            case TYPE_A:
                return new AObject();
            case TYPE_B:
                return new BObject();
            case TYPE_C:
                return new CObject();
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }


    public static MyObject getObjectIf(ObjectType type) {
        if (type == ObjectType.TYPE_A) {
            return new AObject();
        } else if (type == ObjectType.TYPE_B) {
            return new BObject();
        } else if (type == ObjectType.TYPE_C) {
            return new CObject();
        } else {
            throw new IllegalArgumentException("Unknown type");
        }
    }

}
