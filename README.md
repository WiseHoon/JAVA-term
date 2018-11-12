# JAVA-term
## 소개

  java로 구현할 수 있는 게임제작.
  
### 편의점 타이쿤

> 1. 나 필드 : 
     - 재산, 피로도일당 메소드 : 정리하기, 진열하기, 청소하기, 가만히 있기, 상품 판매하기 청소하거나 상품을 진열하고 정리하면 피로도가 상승함. 일당이 상승하거나 가만히 있으면 피로가 풀린다.
     <br/>
> 2. 점장 필드 : 
     - 기분 메소드 : 청소확인, 매출확인, 일당 협상하기 청소상태가 불량이면 잔소리와 함께 나의 일당이 줄어듭니다. 매출이 높으면 점장의 기분이 좋아집니다. 기분이 좋으면 낮은 확률(1/3)로 나에게 보너스를 줍니다. 기분이 안 좋으면 편의점이 깨끗해도 더럽다고 잔소리를 합니다.
  <br/>
> 3. 손님 필드 : 
     - 성향 메소드 : 상품 구매하기 손님 성향을 단계별 0,1,2,3으로 둡니다. (0 : 안 산다 (구경) / 1 : 적게 산다 / 2 : 많이 산다 / 3 : 진상 손님)
  <br/>
> 4. 편의점 필드 : 
     - 매출, 청소상태, 물품의 수 메소드 : 물품 입고하기, 일당주기 ‘나’가 청소하면 청소상태의 숫자가 변화합니다. 손님이 물품을 사면 물품의 수가 줄어들고 매 출이 증가합니다. 하루에 한 번씩 물품이 들어옵니다. 진열을 일정 시간 내에 하지 않으면 들 어온 물품이 사라지게 되고, ‘나’의 일당이 줄어듭니다. (물품의 수 그대로) ‘나’가 물품진열을 선택하면 물품을 판매 가능한 상태로 진열한다. (물품의 수 증가)
  <br/>
> 5. 미니게임 필드 : 
     - 판매상황 메소드 : 일당 협상하기, 상품 판매하기 점장과의 미니게임(가위바위보)를 통해 승리할 시 일당이 인상하게 되고, 실패 시 임금이 그대 로가 됩니다. 시간 내 제시된 문자열을 입력하면 판매를 성공하고 시간을 초과하면 판매를 실패한다.

 
