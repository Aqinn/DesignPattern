package 单例模式;

/**
 * @Author Aqinn
 * @Date 2021/1/26 8:05 上午
 * 优点：枚举实现单例很简单，也很安全。
 * 缺点：经验丰富的 Android 开发人员都会尽量避免使用枚举。官方文档有说明：相比于静态常量Enum会花费两倍以上的内存。
 */
public enum Enum {  // 枚举单例（线程安全，不建议使用）

    INSTANCE;

    Enum() {

    }

}
