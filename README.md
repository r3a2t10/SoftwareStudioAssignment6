�i�n����� assignment6 Readme�j
103000021 �d�f��
103062131 ���M��

1.explanation of your work

    �Plab8�Q���ۦ��A��processing�h�ɧ@�����W��ø�s�C�Njson�ɼg�J
    �@��list�̭��A�]�t�FNode����T�C�`�@��7���A�Υ���Ʀr��ӱ������d��ܡC
    ���O�O1,2,3,4,5,6,7���C�@�}�lnode����̷|���Ӷ��ǱƦb�e������A
    �u�n�ƹ��즲�A�Nnode�첾�ܶ�餤���A����̴N�|�Q�[�J�A�����ح��N�|�s�W����C
    �åB�H�۸}���ܦh�A����򨤦⤧���|���s�u(�]�O�̷�json�ɩҵ������������Y)
    �i�H��ܥX����P���⤧�����s���C�ӥk�観��ӫ���A"Add All"�M"CLEAR"�A
	���O�i�H�[�J�Ҧ�����A�M�M���Ҧ�����C
      

2.problem you encountered and how to solve

  a.Main

	�P�W��lab�t���h�A�D�n�O�t�d�s�W�����C�I�smainapplet�ɡC
	
  b.MainApplet

	�ϥ�setup���ӱ���@�}�l��data(���sload�C��episode��T�B
	�Ncharacter��l��m�����k0)�C�e����ܪ������bdraw()�̭�
	�����A�]�t��ܤ�r��text�Abutton���ЫءA�I�sNetwork class
	�e�@�}�l�����A�P�ɤ@���h��character class���Y�A�C��
	character����ơA��ø�scharacter�Ҧb�a��A�H�Ψ�L�\��
	(��ܦW�r��node�ܤj)�C�Acall�@��connection��method�A
	�ӳs���w�b���̪�character�C

    #connection()

	�o��method�A�B�znode�������s���C���Τ@��arraylist�s���A
	�w�g�b���W��node�C�M��ΤT��for�j��]�A�P�O�񦸬O�_�����Y�A
	�åB�s�u�A�ӥB�ٷ|�̷Ө�node���e�����Y�j�z�j�p(value)�C���
	���P�ʲ�(�ϥ�strokeWeigh())�C

    #keypress()

	�ӧP�_key�O�_�������������A�ӧP�O�O�_���n�����C�åB�n���ssetup�C

	#mouseDragged()

	�D�n�ΨӧP�_�O�_���I���character�C
	��k���j�M�Ҧ�character�A��mouseX,mouseY���y�ШӧP�w�O�_���b
	�Ө���node���A�O���ܡA�ϥΤ@��boolean��isHolding�ӰO���w���I��
	character�C�ھ�isHolding���Ȩӧ�scharacter����T�C(x,y,�O�_��
	�ܦW�r����)���~�]�ھڬO�_isHolding�ӧP�O�ƹ��i�J�ꤧ��A��O�_
	�n�ܲʡC

	#mouseRealease()

	�D�n�O�w����즲��character��}����s�{�ǡC�p�G��}�b�j��d�򤺡A
	�ӥB�٥��Q�[�J�A�h�N��character�[�JcharactersOnCircle��ArrayList�C
	�åB�̷Ӷ��֦̾���node��(nodeOnCircle)�A�Ncharacter�������t�b��P�W�C
	��son cos �Y�i�o�Xcharacter�������y�СA�ӧ�scharacter�̷s����m�C
	�p�G��}�b�D�j�ꪺ�d��̡A�h�N��node�^�k��̪�l����m�̡A
	�M��N�L�qcharactersOnCircle�̲����A�í��s���tnode����m�C
 	
	#mouseClicked()

	�D�n�O�P�_�O�_������clear�Padd all�C
	�I���clear�h�N�Ҧ�node����m�^�k��l�ȡC
	�B�Nlist�M�šC�p�G�I���add all�h�N�Ҧ�node�[�J��W�C

	#loadData

	�P�W��lab�t���h�A�o���h�Fcolour�n�h�P�O�C
	�ϥ�Long.decode(colour)+4278190080L���ഫjson�ɤ������Q���i���T�C

   c.Character

	�D�n�P�_�P�x�s�C��node����T�C�W�r�C���m�C
	�~��draw���ɭԡA�i�H�I�sdisplay�Adisplay�h�i�H�I�s�U�۪�method�A
	fill�һݭn���C��A�Pnode�����Ϊ��C
	
   c.Network

	�ڭ̳o���S���ϥΤӦhNetwork�A�u���bdisplay����ellipse�e�X�j��C
	
  �J�쪺���D�D�n�O�ƹ����ʩM�즲���@�ǧP�_���ܦh���c���A�ݭn�`�N�ܦh�p�Ӹ`�A��p�w�ghold�@��Character����A
  �b�����L�ʧ@�e���n���P�w�L�O�_ !isHoling�A���M�쥻�즲��Character����O��node�W����N�|�ಾ�즲��H�C
  �٦�strokeWeight()���ϥΡA�n�P�wdraw�����ǡA�~�i�H�x����ɶꪺ�u�n�ܲʡA���Character link���u�n�ܲʡA����
  �P���ܲʩ��ܲӵ�������í�w���A�C

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

