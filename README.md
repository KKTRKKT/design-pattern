# 디자인 패턴

본 프로젝트는 다양한 디자인 패턴의 구현 예제를 포함하고 있습니다.

## 목차

### 생성 패턴 (Creational Patterns)
1. [싱글톤 (Singleton)](#싱글톤-singleton)
2. [팩토리 메서드 (Factory Method)](#팩토리-메서드-factory-method)
3. [추상 팩토리 (Abstract Factory)](#추상-팩토리-abstract-factory)
4. [빌더 (Builder)](#빌더-builder)
5. [프로토타입 (Prototype)](#프로토타입-prototype)

### 구조 패턴 (Structural Patterns)
6. [어댑터 (Adapter)](#어댑터-adapter)
7. [브릿지 (Bridge)](#브릿지-bridge)
8. [컴포지트 (Composite)](#컴포지트-composite)
9. [데코레이터 (Decorator)](#데코레이터-decorator)
10. [퍼사드 (Facade)](#퍼사드-facade)
11. [플라이웨이트 (Flyweight)](#플라이웨이트-flyweight)
12. [프록시 (Proxy)](#프록시-proxy)

### 행동 패턴 (Behavioral Patterns)
13. [책임 연쇄 (Chain of Responsibility)](#책임-연쇄-chain-of-responsibility)
14. [커맨드 (Command)](#커맨드-command)
15. [인터프리터 (Interpreter)](#인터프리터-interpreter)
16. [이터레이터 (Iterator)](#이터레이터-iterator)
17. [중재자 (Mediator)](#중재자-mediator)
18. [메멘토 (Memento)](#메멘토-memento)
19. [옵저버 (Observer)](#옵저버-observer)
20. [상태 (State)](#상태-state)
21. [전략 (Strategy)](#전략-strategy)
22. [템플릿 메서드 (Template Method)](#템플릿-메서드-template-method)
23. [템플릿 메서드 콜백 (Template Method Callback)](#템플릿-메서드-콜백-template-method-callback)
24. [비지터 (Visitor)](#비지터-visitor)

---

## 생성 패턴 (Creational Patterns)

### 싱글톤 (Singleton)

**목적**: 클래스의 인스턴스가 오직 하나만 생성되도록 보장하고, 이에 대한 전역 접근점을 제공합니다.

**사용 시기**:
- 애플리케이션에서 클래스의 인스턴스가 정확히 하나만 필요한 경우
- 전역 변수를 사용하지 않고 객체에 대한 단일 접근점이 필요한 경우

**구현 방식**:
- `SimpleSingleton`: 가장 기본적인 구현 (멀티스레드 환경에서 문제 발생 가능)
- `EagerThreadSafeSingleton`: 이른 초기화 방식으로 스레드 안전성 보장
- `LazyThreadSafeSingleton`: synchronized를 이용한 지연 초기화
- `StaticInnerThreadSafeSingleton`: 정적 내부 클래스를 이용한 지연 초기화
- `EnumSingleton`: Enum을 이용한 가장 안전한 방식

**패키지**: `me.kktrkkt.designpattern.singleton`

---

### 팩토리 메서드 (Factory Method)

**목적**: 객체 생성을 위한 인터페이스를 정의하되, 어떤 클래스의 인스턴스를 생성할지는 서브클래스가 결정하도록 합니다.

**사용 시기**:
- 생성할 객체의 정확한 클래스를 미리 알 수 없는 경우
- 객체 생성 로직을 서브클래스로 위임하고 싶은 경우
- 라이브러리나 프레임워크 사용자에게 내부 컴포넌트를 확장하는 방법을 제공하고 싶은 경우

**주요 구성요소**:
- `ShipFactory`: 추상 팩토리 인터페이스
- `WhiteShipFactory`, `BlackShipFactory`: 구체적인 팩토리 구현
- `Ship`, `WhiteShip`, `BlackShip`: 생성될 제품 클래스

**패키지**: `me.kktrkkt.designpattern.factorymethod`

---

### 추상 팩토리 (Abstract Factory)

**목적**: 구체적인 클래스를 지정하지 않고 관련되거나 의존적인 객체들의 패밀리를 생성하는 인터페이스를 제공합니다.

**사용 시기**:
- 시스템이 여러 제품군 중 하나를 선택해서 사용해야 하는 경우
- 관련된 제품 객체들이 함께 사용되도록 설계하고 싶은 경우
- 제품의 구체적인 클래스를 감추고 인터페이스만 노출하고 싶은 경우

**주요 구성요소**:
- `ShipPartsFactory`: 추상 팩토리 인터페이스
- `WhiteShipPartsFactory`, `BlackShipPartsFactory`: 구체적인 팩토리
- `Anchor`, `Wheel`: 제품 인터페이스
- 각 색상별 부품 구현체

**패키지**: `me.kktrkkt.designpattern.abstractfactory`

---

### 빌더 (Builder)

**목적**: 복잡한 객체의 생성 과정과 표현 방법을 분리하여, 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 합니다.

**사용 시기**:
- 객체 생성 시 많은 매개변수가 필요한 경우
- 객체 생성 과정이 복잡하고 여러 단계를 거치는 경우
- 불변 객체를 생성하고 싶은 경우

**주요 구성요소**:
- `TourPlanBuilder`: 빌더 인터페이스
- `DefaultTourPlanBuilder`: 구체적인 빌더 구현
- `TourPlanDirector`: 빌더를 사용하여 객체를 생성하는 디렉터
- `TourPlan`: 생성될 복잡한 객체

**패키지**: `me.kktrkkt.designpattern.builder`

---

### 프로토타입 (Prototype)

**목적**: 원본 객체를 복제하여 새로운 객체를 생성합니다.

**사용 시기**:
- 생성할 객체의 종류가 런타임에 결정되는 경우
- 객체 생성 비용이 복제 비용보다 큰 경우
- 클래스의 인스턴스가 몇 가지 상태 조합 중 하나를 가지는 경우

**주요 구성요소**:
- `GithubIssue`: 복제 가능한 객체 (Cloneable 구현)
- `GithubRepository`: 이슈를 관리하는 저장소

**패키지**: `me.kktrkkt.designpattern.prototype`

---

## 구조 패턴 (Structural Patterns)

### 어댑터 (Adapter)

**목적**: 호환되지 않는 인터페이스를 가진 객체들이 함께 작동할 수 있도록 합니다.

**사용 시기**:
- 기존 클래스를 사용하고 싶지만 인터페이스가 맞지 않는 경우
- 재사용 가능한 클래스를 만들고 싶지만 관련 없는 클래스들과 함께 사용해야 하는 경우

**주요 구성요소**:
- `UserDetails`: 타겟 인터페이스
- `Account`: 어댑티 (변환이 필요한 클래스)
- `AccountUserDetails`, `AccountToUserDetailsAdapter`: 어댑터 구현

**패키지**: `me.kktrkkt.designpattern.adapter`

---

### 브릿지 (Bridge)

**목적**: 구현부에서 추상층을 분리하여 각자 독립적으로 변형할 수 있게 합니다.

**사용 시기**:
- 추상화와 구현을 영구적으로 결합하고 싶지 않은 경우
- 추상화와 구현 모두 서브클래싱을 통해 확장 가능해야 하는 경우
- 구현 변경이 클라이언트 코드에 영향을 주지 않아야 하는 경우

**주요 구성요소**:
- `Champion`: 추상화 인터페이스
- `DefaultChampion`: 구체적인 추상화
- `Skin`: 구현 인터페이스
- `KDA`, `PoolParty`: 구체적인 구현

**패키지**: `me.kktrkkt.designpattern.bridge`

---

### 컴포지트 (Composite)

**목적**: 객체들을 트리 구조로 구성하여 부분-전체 계층을 표현합니다. 클라이언트가 개별 객체와 복합 객체를 동일하게 다룰 수 있게 합니다.

**사용 시기**:
- 객체들의 계층 구조를 표현하고 싶은 경우
- 클라이언트가 개별 객체와 복합 객체를 구별하지 않고 동일하게 다루기를 원하는 경우

**주요 구성요소**:
- `Item`: 컴포넌트 인터페이스
- `Bag`: 복합 객체 (다른 아이템들을 포함)
- `DoranBlade`, `BloodBlade`, `HealPotion`: 개별 객체

**패키지**: `me.kktrkkt.designpattern.composite`

---

### 데코레이터 (Decorator)

**목적**: 객체에 추가적인 책임을 동적으로 부여합니다. 기능 확장을 위해 서브클래싱 대신 유연한 대안을 제공합니다.

**사용 시기**:
- 객체에 동적으로 기능을 추가하고 싶은 경우
- 기능 추가나 제거가 런타임에 일어나야 하는 경우
- 서브클래싱으로 인한 클래스 폭발을 피하고 싶은 경우

**주요 구성요소**:
- `CommentService`: 컴포넌트 인터페이스
- `DefaultCommentService`: 기본 구현
- `CommentServiceDecorator`: 데코레이터 추상 클래스
- `SpamFilteringCommentServiceDecorator`, `TrimmingCommentServiceDecorator`: 구체적인 데코레이터

**패키지**: `me.kktrkkt.designpattern.decorator`

---

### 퍼사드 (Facade)

**목적**: 서브시스템의 인터페이스 집합에 대한 통합된 인터페이스를 제공합니다. 서브시스템을 더 쉽게 사용할 수 있게 합니다.

**사용 시기**:
- 복잡한 서브시스템에 대한 간단한 인터페이스가 필요한 경우
- 서브시스템을 계층화하고 싶은 경우
- 클라이언트와 서브시스템 간의 의존성을 줄이고 싶은 경우

**주요 구성요소**:
- `EmailFacade`: 이메일 발송을 위한 간단한 파사드 인터페이스

**패키지**: `me.kktrkkt.designpattern.facade`

---

### 플라이웨이트 (Flyweight)

**목적**: 많은 수의 유사한 객체를 효율적으로 지원하기 위해 공유를 사용합니다.

**사용 시기**:
- 애플리케이션이 많은 수의 객체를 사용하는 경우
- 객체의 많은 부분을 외부 상태로 만들 수 있는 경우
- 메모리 사용량을 줄이고 싶은 경우

**주요 구성요소**:
- `Car`: 플라이웨이트 객체
- `CarFactory`: 플라이웨이트 객체를 생성하고 관리하는 팩토리

**패키지**: `me.kktrkkt.designpattern.flyweight`

---

### 프록시 (Proxy)

**목적**: 다른 객체에 대한 접근을 제어하기 위한 대리자나 자리표시자를 제공합니다.

**사용 시기**:
- 원격 객체에 대한 접근을 제어하고 싶은 경우
- 무거운 객체의 생성을 지연하고 싶은 경우
- 실제 객체에 대한 접근을 제어하거나 추가 기능을 제공하고 싶은 경우

**주요 구성요소**:
- `MessageSender`: 서비스 인터페이스
- `EmailSender`: 실제 서비스 구현
- `MessageSenderProxy`: 프록시 객체

**패키지**: `me.kktrkkt.designpattern.proxy`

---

## 행동 패턴 (Behavioral Patterns)

### 책임 연쇄 (Chain of Responsibility)

**목적**: 요청을 처리할 수 있는 기회를 하나 이상의 객체에게 부여하여 요청하는 객체와 처리하는 객체 간의 결합을 피합니다.

**사용 시기**:
- 여러 객체 중 하나가 요청을 처리해야 하는데, 처리자를 미리 알 수 없는 경우
- 명시적으로 수신자를 지정하지 않고 여러 객체 중 하나에게 요청을 전달하고 싶은 경우
- 요청을 처리할 수 있는 객체 집합을 동적으로 지정하고 싶은 경우

**주요 구성요소**:
- `RequestHandler`: 핸들러 인터페이스
- `AuthRequestHandler`, `LoggingRequestHandler`: 구체적인 핸들러
- `Request`: 처리될 요청 객체

**패키지**: `me.kktrkkt.designpattern.chain_of_responsibility`

---

### 커맨드 (Command)

**목적**: 요청을 객체로 캡슐화하여 요청이 서로 다른 사용자를 매개변수화하고, 요청을 대기시키거나 로깅하며, 되돌릴 수 있는 연산을 지원합니다.

**사용 시기**:
- 수행할 동작을 객체로 매개변수화하고 싶은 경우
- 요청을 큐에 저장하거나 로그로 기록하고 싶은 경우
- 되돌릴 수 있는 연산을 지원하고 싶은 경우

**주요 구성요소**:
- `Command`: 커맨드 인터페이스
- `LightOnCommand`, `GameStartCommand`: 구체적인 커맨드
- `Button`: 인보커 (커맨드를 실행하는 객체)
- `Light`, `Game`: 리시버 (실제 작업을 수행하는 객체)

**패키지**: `me.kktrkkt.designpattern.command`

---

### 인터프리터 (Interpreter)

**목적**: 언어에 대한 문법 표현을 정의하고, 그 언어로 된 문장을 해석하는 인터프리터를 제공합니다.

**사용 시기**:
- 간단한 언어를 해석해야 하는 경우
- 문법이 간단하고 효율성이 중요하지 않은 경우

**주요 구성요소**:
- `PostFixExpression`: 표현식 인터페이스
- `PlusExpression`, `MinusExpression`: 구체적인 표현식
- `VariableExpression`: 변수 표현식
- `PostFixParser`: 파서
- `PostfixNotation`: 후위 표기법 계산기

**패키지**: `me.kktrkkt.designpattern.interpreter`

---

### 이터레이터 (Iterator)

**목적**: 내부 표현을 노출하지 않고 집합 객체의 원소들을 순차적으로 접근할 수 있는 방법을 제공합니다.

**사용 시기**:
- 집합 객체의 내부 구조를 노출하지 않고 접근하고 싶은 경우
- 집합 객체에 대해 여러 가지 순회 방법을 지원하고 싶은 경우

**주요 구성요소**:
- `Board`: 집합 객체 (Iterable 구현)
- `Post`: 원소 객체

**패키지**: `me.kktrkkt.designpattern.iterator`

---

### 중재자 (Mediator)

**목적**: 객체 집합이 상호작용하는 방법을 캡슐화하는 객체를 정의합니다. 객체들이 서로를 직접 참조하지 않도록 하여 결합도를 낮춥니다.

**사용 시기**:
- 여러 객체가 잘 정의되었지만 복잡한 방식으로 통신하는 경우
- 객체를 재사용하기 어려운데, 많은 다른 객체를 참조하고 있기 때문인 경우
- 여러 클래스에 분산된 행위를 커스터마이징하고 싶지만 많은 서브클래스를 만들고 싶지 않은 경우

**주요 구성요소**:
- `FrontDesk`: 중재자
- `Guest`: 손님 (요청자)
- `CleaningService`, `Restaurant`, `Gym`: 서비스 제공자

**패키지**: `me.kktrkkt.designpattern.mediator`

---

### 메멘토 (Memento)

**목적**: 객체의 내부 상태를 저장하고 나중에 이 상태로 복구할 수 있게 합니다. 캡슐화를 위배하지 않습니다.

**사용 시기**:
- 객체의 상태를 저장했다가 나중에 복원해야 하는 경우
- 상태를 얻는 데 필요한 인터페이스가 캡슐화를 위배하는 경우

**주요 구성요소**:
- `Game`: 원본 객체 (Originator)
- `GameSave`: 메멘토 객체 (상태 저장)

**패키지**: `me.kktrkkt.designpattern.memento`

---

### 옵저버 (Observer)

**목적**: 객체 사이에 일대다 의존 관계를 정의하여, 한 객체의 상태가 변하면 그 객체에 의존하는 다른 객체들이 자동으로 알림을 받고 갱신될 수 있게 합니다.

**사용 시기**:
- 한 객체의 변경이 다른 객체들의 변경을 필요로 하고, 몇 개의 객체가 변경되어야 하는지 모르는 경우
- 객체가 다른 객체들에게 자신의 변화를 통보할 수 있어야 하지만, 그 객체들이 누구인지 가정할 수 없는 경우

**주요 구성요소**:
- `ChatServer`: 주체 (Subject)
- `User`: 옵저버 (Observer)
- `ChatServerSubscriber`: 구독자 인터페이스
- PropertyChangeListener와 Flow API를 활용한 구현 예제도 포함

**패키지**: `me.kktrkkt.designpattern.observer`

---

### 상태 (State)

**목적**: 객체의 내부 상태가 변경될 때 객체의 행동을 변경할 수 있게 합니다. 객체가 클래스를 바꾸는 것처럼 보입니다.

**사용 시기**:
- 객체의 행동이 상태에 따라 달라지고, 런타임에 상태가 변경될 수 있는 경우
- 상태에 따른 조건문이 복잡한 경우

**주요 구성요소**:
- `OnlineCourse`: 컨텍스트 객체
- `State`: 상태 인터페이스
- `DraftState`, `PrivateState`, `PublishedState`: 구체적인 상태
- `Student`: 학생 객체

**패키지**: `me.kktrkkt.designpattern.state`

---

### 전략 (Strategy)

**목적**: 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 합니다. 알고리즘을 사용하는 클라이언트와 독립적으로 알고리즘을 변경할 수 있게 합니다.

**사용 시기**:
- 관련된 알고리즘들의 계열이 있고, 이들을 런타임에 선택해야 하는 경우
- 알고리즘의 다양한 변형이 필요한 경우
- 조건문 대신 다형성을 사용하고 싶은 경우

**주요 구성요소**:
- `BlueLightRedLight`: 컨텍스트 객체
- `Speed`: 전략 인터페이스
- `Normal`, `Fast`: 구체적인 전략

**패키지**: `me.kktrkkt.designpattern.strategy`

---

### 템플릿 메서드 (Template Method)

**목적**: 알고리즘의 골격을 정의하고, 일부 단계를 서브클래스에서 구현하도록 합니다. 알고리즘의 구조는 그대로 유지하면서 특정 단계를 재정의할 수 있게 합니다.

**사용 시기**:
- 알고리즘의 불변 부분을 한 번만 구현하고 가변 부분은 서브클래스에 맡기고 싶은 경우
- 서브클래스들의 공통된 행동을 추출하여 공통 클래스에 모으고 싶은 경우

**주요 구성요소**:
- `FileProcessor`: 템플릿 메서드를 정의하는 추상 클래스
- `Plus`, `Multiply`: 구체적인 구현 클래스

**패키지**: `me.kktrkkt.designpattern.templatemethod`

---

### 템플릿 메서드 콜백 (Template Method Callback)

**목적**: 템플릿 메서드 패턴의 변형으로, 상속 대신 콜백을 사용하여 알고리즘의 특정 단계를 커스터마이징합니다.

**사용 시기**:
- 템플릿 메서드 패턴을 사용하고 싶지만 상속을 피하고 싶은 경우
- 함수형 프로그래밍 스타일을 선호하는 경우

**주요 구성요소**:
- `FileProcessor`: 콜백을 받아 처리하는 클래스

**패키지**: `me.kktrkkt.designpattern.templatemethodcallback`

---

### 비지터 (Visitor)

**목적**: 객체 구조를 이루는 원소에 대해 수행할 연산을 표현합니다. 연산을 적용할 원소의 클래스를 변경하지 않고 새로운 연산을 정의할 수 있게 합니다.

**사용 시기**:
- 객체 구조에 포함된 객체들에 대해 다양한 연산을 수행해야 하는 경우
- 객체 구조는 거의 변하지 않지만 연산은 자주 추가되는 경우
- 관련 없는 연산들이 객체 클래스를 오염시키는 것을 피하고 싶은 경우

**주요 구성요소**:
- `Shape`: 방문 대상 인터페이스
- `Circle`, `Rectangle`, `Triangle`: 구체적인 도형
- `Device`: 비지터 인터페이스
- `Phone`, `Pad`, `Watch`: 구체적인 비지터

**패키지**: `me.kktrkkt.designpattern.visitor`

---

## 참고

이 프로젝트는 GoF(Gang of Four)의 디자인 패턴을 Java로 구현한 예제입니다. 각 패턴은 독립적으로 학습할 수 있으며, 실제 사용 예제를 포함하고 있습니다.
