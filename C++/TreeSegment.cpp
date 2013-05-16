#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <ctype.h>

#define FOR(c, m) for(int c=0;c<(m);c++)
#define FORE(c, f, t) for(int c=(f);c<(t);c++)

#define MOD 1000000007
#define MAXITEMS 1000



long long power(long long a, long long count) {
    long long result = 1;
    long long power = a % MOD;
    while (count > 0) {
        if (count & 1) result = (result * power) % MOD;
        count >>= 1;
        power = (power * power) % MOD;
    }
    return result;
}

int main(void) {
    int t;// = getInt();
    scanf("%d",&t);
    //scanf("%d", &t);
    FOR(tt, t) {
        long long v;
        scanf("%lld",&v); //= getLong();
        int n;// = getInt();
        scanf("%d",&n);
        long long p[MAXITEMS], q[MAXITEMS];
        long long l[MAXITEMS];

        //scanf("%lld %d", &v, &n);
        scanf("%lld %lld",&p[0],&p[1]);// = getLong();
       //p[1] = getLong();
        long long a0,b0,c0,m0;
        scanf("%lld %lld %lld %lld",&a0,&b0,&c0,&m0);// = getLong(), b0 = getLong(), c0 = getLong(), m0 = getLong();
        //scanf("%lld %lld %lld %lld %lld %lld", &p[0], &p[1], &a0, &b0, &c0, &m0);
      //  q[0] = getLong();
       // q[1] = getLong();
       // scanf("%lld %lld",&q[0],&q[1]);
        long long a1,b1,c1,m1;// = getLong(), b1 = getLong(), c1 = getLong(), m1 = getLong();
        scanf("%lld %lld %lld %lld %lld %lld", &q[0], &q[1], &a1, &b1, &c1, &m1);

        FORE(i, 2, n) {
            p[i] = (((((a0 * a0) % m0) * p[i - 1]) % m0) + ((b0 * p[i - 2]) % m0) + c0) % m0;
            q[i] = (((((a1 * a1) % m1) * q[i - 1]) % m1) + ((b1 * q[i - 2]) % m1) + c1) % m1;
        }
        //printf("Dimensions: ");
        long long exp = 1;
        FOR(i, n) {
            l[i] = (p[i] * m1 + q[i]) % (MOD - 1);
            exp = (exp * l[i]) % (MOD - 1);
        }
        v = power(v % MOD, exp);
        printf("%d\n", (int)v);
    }
}
