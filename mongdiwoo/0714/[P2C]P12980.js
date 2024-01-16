function solution(n) {
    let ans = 0;

    while (n > 0) {
        if (n % 2 != 0) {
            n--;
            ans++;
        } else {
            n /= 2;
        }
    }

    return ans;
}

// P12980: 점프와 순간이동
