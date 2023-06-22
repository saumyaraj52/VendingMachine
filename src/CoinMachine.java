public class CoinMachine {
    CoinType coinType;
    Integer count;
    CoinMachine next;

    public CoinMachine(CoinType coinType,CoinMachine coinMachine)
    {
        this.coinType = coinType;
        this.next = coinMachine;
        this.count=0;
    }

    public CoinMachine(CoinType coinType)
    {
        this.coinType = coinType;
        this.next = null;
        this.count=0;
    }

    public boolean getChange(int sum)
    {
        int cointval = 0;
        if(this.coinType == CoinType.TEN)
            cointval+=10;
        else if(this.coinType == CoinType.FIVE)
            cointval+=5;
        else if(this.coinType == CoinType.TWO)
            cointval+=2;
        else if(this.coinType == CoinType.ONE)
            cointval+=1;
        System.out.println("Change amount now: "+sum+" cointval : "+this.coinType+" coin count: "+this.count);
        int totvalhere = this.count*cointval;
        if(totvalhere>sum)
        {
            int cointCntSub = sum/cointval;
            //this.count -= sum/cointval;
            if(sum%cointval!=0)
            {
                this.count -= cointCntSub;
                if(this.next!=null&&this.next.getChange(sum%cointval)==true) return true;
                else
                {
                    //sum+=totvalhere;
                    this.count += cointCntSub;
                    return false;
                }
            }
            else {
                this.count -=cointCntSub;
                return true;
            }
        }
        else {
            sum-=totvalhere;
            int prev = this.count;
            this.count = 0;
            if(sum==0) return true;
            else if(this.next!=null&&this.next.getChange(sum)==true) return true;
            else
            {
                sum+=totvalhere;
                this.count = prev;
                return false;
            }
        }
    }

    public void addCoin(CoinType coinType)
    {
        if(this.coinType == coinType) {
            this.count += 1;
            return;
        }
        else if(this.coinType == coinType) {
            this.count += 1;
            return;
        }
        else if(this.coinType == coinType) {
            this.count += 1;
            return;
        }
        else if(this.coinType == coinType) {
            this.count += 1;
            return;
        }

        this.next.addCoin(coinType);
    }

    public void removeAllCoin() {

        this.count = 0;
        if(this.next!=null)
            this.next.removeAllCoin();
    }
}
