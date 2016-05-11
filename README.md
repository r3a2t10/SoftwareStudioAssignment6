【軟體實驗 assignment6 Readme】
103000021 吳柏瑤
103062131 陳映竹

1.explanation of your work

    與lab8十分相似，用processing去時作介面上的繪製。將json檔寫入
    一個list裡面，包含了Node的資訊。總共有7關，用左方數字鍵來控制關卡選擇。
    分別是1,2,3,4,5,6,7關。一開始node角色們會按照順序排在畫面左方，
    只要滑鼠拖曳，將node拖移至圓圈中間，角色們就會被加入，圓圈圈裏面就會新增角色。
    並且隨著腳色變多，角色跟角色之間會有連線(也是依照json檔所給予的角色關係)
    可以顯示出角色與角色之間的連結。而右方有兩個按鍵，"Add All"和"CLEAR"，
	分別可以加入所有角色，和清除所有角色。
      

2.problem you encountered and how to solve

  a.Main

	與上次lab差不多，主要是負責新增視窗。呼叫mainapplet檔。
	
  b.MainApplet

	使用setup先來控制一開始的data(重新load每個episode資訊、
	將character初始位置等等歸0)。畫面顯示的部分在draw()裡面
	完成，包含顯示文字的text，button的創建，呼叫Network class
	畫一開始的圓圈，同時一直去取character class裡頭，每個
	character的資料，來繪製character所在地方，以及其他功能
	(顯示名字或node變大)。再call一個connection的method，
	來連結已在圓圈裡的character。

    #connection()

	這個method再處理node之間的連結。先用一個arraylist存取，
	已經在圓圈上的node。然後用三個for迴圈跑，判別比次是否有關係，
	並且連線，而且還會依照兩node之前的關係強弱大小(value)。顯示
	不同粗細(使用strokeWeigh())。

    #keypress()

	來判斷key是否有按到對應的鍵，來判別是否有要換關。並且要重新setup。

	#mouseDragged()

	主要用來判斷是否有點選到character。
	方法為搜尋所有character，用mouseX,mouseY的座標來判定是否落在
	該角色node中，是的話，使用一個boolean值isHolding來記錄已有點選
	character。根據isHolding的值來更新character的資訊。(x,y,是否顯
	示名字等等)此外也根據是否isHolding來判別滑鼠進入圓之後，圓是否
	要變粗。

	#mouseRealease()

	主要是針對剛剛拖曳的character放開的後製程序。如果放開在大圓範圍內，
	而且還未被加入，則將此character加入charactersOnCircle的ArrayList。
	並且依照圓圈裡擁有的node數(nodeOnCircle)，將character平均分配在圓周上。
	用son cos 即可得出character的平均座標，來更新character最新的位置。
	如果放開在非大圓的範圍裡，則將此node回歸到最初始的位置裡，
	然後將他從charactersOnCircle裡移除，並重新分配node的位置。
 	
	#mouseClicked()

	主要是判斷是否有按到clear與add all。
	點選到clear則將所有node的位置回歸初始值。
	且將list清空。如果點選到add all則將所有node加入圓上。

	#loadData

	與上次lab差不多，這次多了colour要去判別。
	使用Long.decode(colour)+4278190080L來轉換json檔中給的十六進位資訊。

   c.Character

	主要判斷與儲存每個node的資訊。名字顏色位置。
	外面draw的時候，可以呼叫display，display則可以呼叫各自的method，
	fill所需要的顏色，與node本身形狀。
	
   c.Network

	我們這次沒有使用太多Network，只有在display中用ellipse畫出大圓。
	
  遇到的問題主要是滑鼠移動和拖曳的一些判斷式很多很繁雜，需要注意很多小細節，比如已經hold一個Character之後，
  在執行其他動作前都要先判定他是否 !isHoling，不然原本拖曳的Character移到別的node上之後就會轉移拖曳對象。
  還有strokeWeight()的使用，要判定draw的順序，才可以掌握何時圓的線要變粗，何時Character link的線要變粗，防止
  同時變粗或變細等等的不穩定狀態。

//============================================================================================================================

# Software Studio Assignment 6

## Notes
+ You will have to import the libraries on your own. All the libraries are provided on iLMS.
+ Even you followed the design TA shown in the video, you still have to explain the control of the program in the next section.

## Explanation of the Design
Explain your design in this section.  
Example:
### Operation
+ Clicking on the button "Add All": users can add all the characters into network to be analyzed.
+ Clicking on the button "Clear": users can remove all the characters from network.
+ Hovering on the character: the name of the character will be revealed.
+ By dragging the little circle and drop it in the big circle, the character will be added to the network.
+ By pressing key 1~7 on the keyboard, users can switch between episodes.
+ ...etc.

### Visualization
+ The width of each link is visualized based on the value of the link.
+ ...etc.

