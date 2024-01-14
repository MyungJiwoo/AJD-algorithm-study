class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

// 큐 선언
class Queue {
    constructor() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}

// 상속을 위해 prototype을 사용
Queue.prototype.enqueue = function (newValue) {
    const newNode = new Node(newValue);
    if (this.head === null) {
        this.head = this.tail = newNode;
    } else {
        this.tail.next = newNode;
        this.tail = newNode;
    }
    this.size += 1;
};

Queue.prototype.dequeue = function () {
    const value = this.head.value;
    this.head = this.head.next;
    this.size -= 1;
    return value;
};

Queue.prototype.peek = function () {
    return this.head.value;
};

Queue.prototype.getSize = function () {
    return this.size;
};

function solution(bridge_length, weight, truck_weights) {
    let time = 0;
    let truck_weight = 0;

    // 현재 다리를 건너고 있는 트럭
    const queue = new Queue();

    for (let i = 0; i < truck_weights.length; i++) {
        while (true) {
            // 현재 다리를 건너는 트럭이 아무것도 없다면?
            if (queue.getSize() == 0) {
                queue.enqueue(truck_weights[i]);
                truck_weight += truck_weights[i];
                time++;
                break;
            }
            // 현재 다리위가 꽉 차있다면?
            else if (queue.getSize() == bridge_length) {
                truck_weight -= queue.dequeue();
                // time++;
            }
            // 현재 다리 위가 꽉 차지 않았고 더 건널 수 있다면?
            else {
                // 다음 트럭의 무게와 현재 무게를 더했을 때 최대 무게를 넘지 않으면 다리 위에 올림

                if (weight >= truck_weight + truck_weights[i]) {
                    queue.enqueue(truck_weights[i]);
                    truck_weight += truck_weights[i];
                    time++;
                    break;
                } else {
                    queue.enqueue(0);
                    time++;
                }
            }
        }
    }

    return time + bridge_length;
}
