package me.kktrkkt.designpattern.observer.flow;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowInJava {

    public static void main(String[] args) {
        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {
            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                subscriber.onNext("hello flow");
                subscriber.onComplete();
            }
        };

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>(){

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("onSubscribe");
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("Next");
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        publisher.subscribe(subscriber);
        System.out.println("처리완료");
    }
}
