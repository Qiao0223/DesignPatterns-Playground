# 建造者模式

建造者模式（Builder Pattern）是创建型设计模式的一种，它通过将一个复杂对象的构建过程分离出来，使得同样的构建过程可以创建不同类型的对象。建造者模式的核心思想是：将对象的构建过程与表示（即对象的具体内容）分离，从而使得构建过程的细节对客户端代码透明，客户端只需指定所需要的产品类型和组件，构建过程由建造者负责完成。

## 适用场景：

- 当对象的构建过程独立于其组件的创建时，尤其是当对象有复杂的构建过程时。
- 当构建过程需要一步步地进行时，每一步的具体实现可能不同。
- 当同样的构建过程可能会产生不同表现的对象时。

## 结构
### 1. **Product（产品类）**

- 表示最终要创建的复杂对象。该类定义了产品的基本属性和功能。
- 通常是构建的目标对象，在建造过程中逐步组成。

### 2. **Builder（抽象建造者）**

- 定义了构建产品的各个部分的步骤，但并不涉及具体的实现。
- 提供抽象方法，例如 `buildPart1()`、`buildPart2()` 等，供具体建造者实现。

### 3. **ConcreteBuilder（具体建造者）**

- 实现了 `Builder` 类的具体构建过程，负责具体构建产品的每个部件。
- 在构建过程中，具体建造者会将不同部分的创建逻辑封装在自己的实现中，并在完成构建后返回最终的产品。

### 4. **Director（指挥者）**

- 负责按照特定的顺序来调用建造者的构建方法，以完成复杂对象的构建。
- 指挥者类会管理建造过程，并确保建造者遵循正确的构建步骤。
- 它依赖于 `Builder` 来构建最终产品，但不关心产品的具体内容。

### 5. **Client（客户端）**

- 负责使用指挥者来构建复杂对象。客户端通过指定具体建造者，指挥者会根据指定的建造者构建出所需的产品。
- 客户端只关心最终的产品，避免了处理构建的细节。

## 优缺点：

**优点：**

- **分离构建过程与表示**：建造者模式将对象的构建过程与表示（即最终的产品）分离开，使得构建过程和产品的具体实现解耦。
- **代码复用**：通过不同的建造者，客户端可以灵活地创建不同的产品，而无需重复编写构建代码。
- **复杂对象的灵活构建**：在产品需要进行逐步构建或需要选择不同部分时，建造者模式提供了很好的支持。

**缺点：**

- **增加类的数量**：每个具体建造者通常都需要一个单独的类，这会导致系统中类的数量增多。
- **建造者不灵活**：对于某些简单的对象，使用建造者模式可能显得过于复杂。在对象构建过程非常简单时，使用建造者模式会导致过度设计。