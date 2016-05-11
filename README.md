【軟體實驗 assignment6 Readme】
103000021 吳柏瑤
103062131 陳映竹

1.explanation of your work

    與lab8十分相似，用processing去時作介面上的繪製。將json檔寫入
    一個list裡面，包含了Node的資訊。總共有7關，用左方數字鍵來控是關卡選擇。
    分別是1,2,3,4,5,6,7關。一開始node角色們會按照順序排在畫面左方，
    只要滑鼠拖曳，將node拖移至圓圈中間，角色們就會被加入，圓圈圈裏面就會新增角色。
    並且隨著腳色變多，角色跟角色之間會有連線(也是依照json檔所給予的角色關係)
    可以顯示出角色與角色之間的連結。
      

2.problem you encountered and how to solve

  a.Main

	與上次lab差不多，主要是負責新增視窗。呼叫mainapplet檔。
	
  b.MainApplet

	使先setup先來控制一開始的data，draw是processing的特性，
	就是會一直跑draw讓畫面不斷的更新。除了話一開始的圓圈之外，
	也會依直去取character class裡頭，每個character的資料，
	來繪製character所在地方。再來call一個connection的method，
	來連結友在圓圈裡的node。

        #connection()

    	這個method再處理node之間的連結。先用一個arraylist存取，
	已經在圓圈上的node。然後用三個for迴圈跑，判別比次是否有關係，
	並且連線，而且還會依照兩node之前的關係強弱大小。縣市不同粗細。

        #keypress()

	來判斷key是否有按下去，來判別是否有要換關。並且要重新setup。

	#mouseDragged()

	內建好的function，只要滑鼠拖曳選行為時，就會跑者個function。
	主要先判斷是否有抓到node。然後會開始迴圈搜尋所有node，
	看滑鼠是drag到哪個character。假如判斷到，就會開始針角色行動。
	針對所抓取的character進行目前x y的移動(draw會不斷更新)。
	如果有東西抓近來成功後，圓圈圈的stroke就會加粗。

	#mouseRealease()

	針對剛剛拖曳的character做放開的後製程序。如果放開在大園範圍內。
	則加入此node。讓這個node加入放置in_circle_list裡。
	並且依照圓圈裡擁有的node數，將node平均分配在圓周上。
	用son cos 即可計算所在位址。來更新character最新的位置。
	如果放開在非大圓的範圍裡，則將此node回歸到最初始的位置裡，
	然後將他從in_circle_list裡移除。在重新分配node的位置。
 	
	#mouseClicked()

	主要是判斷是否有按到clear與add all。
	點選到clear則將所有node的位置回歸初始值。
	且將list清空。如果點選到add則將所有node加入，
	nodeOnCircle = nodes.size();
	然後全部清除，再將所有node用迴圈的方式加上去。

	#loadData

	與上次lab差不多，這次多了colour要去判別。
	然後在load時候，就順邊將character們，
	用for計算的方式平均排列上去。

   c.Character

	主要判斷與儲存每個node的資訊。名字顏色位置。
	外面draw的時候，可以呼叫display，display則可以呼叫各自的method，
	fill所需要的顏色，與node本身形狀。

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

