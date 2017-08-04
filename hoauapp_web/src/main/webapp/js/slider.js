/**
 * 
 * APP主页广告资源管理界面
 * 
 */


//日期格式
function dateFormate (value){  
    var createTime = Ext.Date.format(new Date(value),"Y-m-d H:i:s");
    return createTime;  
} ;


//资源添加窗口表单
Ext.define('app.slider.myformpanel.windowform',{
	 extend:'Ext.form.Panel',
	 region:'center',
	 defaults:{
		 xtype:'textfield',
		 margin:'5 5 0 5'		 
	 },
     layout:'column',
     items: [
     {
         fieldLabel: '标题',
         allowBlank: false,
         name: 'title',
         maxLength:30,
         columnWidth: 1
     },{
         fieldLabel: '图片地址',
         allowBlank: false,
         name: 'imageUrl',
         maxLength:100,
         columnWidth: 1
     },{
         fieldLabel: '点击连接地址',
         allowBlank: false,
         name: 'link',
         maxLength:300,
         columnWidth: 1
     }],
     buttons: [{
         text: '添加',
         formBind: true,
         disabled: true,
         handler: function() {
        	 var form = this.up('form').getForm();  
        	 if(form.isValid()){  
        		 var winstore = this.up('form').up('window').getGridstore();
        		 var formdata = form.getValues();
        		 var data=[{
     				'title':formdata.title,
     				'imageUrl':formdata.imageUrl,
     				'link':formdata.link
     				}];      		 
        		 winstore.loadData(data,true);
        		 this.up('form').up('window').hide();
            	 form.reset(); 
        	 }
      	  
         }
     },{
         text: '取消',
         formBind: true,
         disabled: true,
         handler: function() {
        	 var form = this.up('form').getForm();  
        	 this.up('form').up('window').hide();
        	 form.reset();       	 
         }
     }]
	
});



//资源添加窗口
Ext.define('app.slider.myformpanel.windowpanel',{
	extend:'Ext.window.Window',
	height: 200,
    width: 400,
    closeAction :'hide',
    layout:'border',
    title:'添加',
    modal:true,
    winform:null,
    gridstore:null,
    setGridstore:function( store){
    	this.gridstore = store;
    },
    getGridstore:function(){
    	return this.gridstore;
    },
    getWinform:function(){
    	if(this.winform==null){
    		this.winform = Ext.create('app.slider.myformpanel.windowform');
    	}
    	return this.winform;
    },
    constructor : function(config) {
  		var me = this, 
  		cfg = Ext.apply({}, config);
  		me.items =[me.getWinform()];
  		me.callParent([ cfg ]);

  	 }
    
		
});



//提交资源数据模型
Ext.define('app.slider.sliderModel', {
    extend: 'Ext.data.Model',
    fields: [     
        {name: 'id',   type: 'int'},
        {name: 'title',  type: 'string'},//标题
        {name: 'version',  type: 'string'},//版本号
        {name: 'imageUrl',  type: 'string'}, //图片地址
        {name: 'link',  type: 'string'}, //点击链接。http:// or hoau:程序定义
        {name: 'createtime', type:'date',dateFormat: 'Y-m-dTH:i:s'} //创建时间
    ]
});

//提交资源列表 store
Ext.define('app.slider.myformpanel.store',{
	extend:'Ext.data.Store',
	 model: 'app.slider.sliderModel',	
	 proxy: {
		 type: 'memory',
	     reader: {
	         type: 'json',
	         rootProperty: 'items'
	     }
	              
	 }
});



//资源信息store
Ext.define('app.slider.grid.store',{
	extend:'Ext.data.Store',
	 model: "app.slider.sliderModel",
	 pageSize: 10,
	 proxy: {
	        type: "ajax",
	        url: "/hoauapp/findslider.action",
	        reader: {
	            type: "json",
	            root:"slierlist",
	            totalProperty: 'total'
	        }
	                
	 },
	 autoLoad: false
});

//列表分页工具
Ext.define('app.slider.grid.toolbar',{
	extend:'Ext.PagingToolbar',
	displayInfo: true,
    displayMsg: '显示{0}-{1}条，共{2}条',
    emptyMsg: "没有数据"
});

//资源明细总列表
Ext.define('app.slider.grid.gridpanle',{
	extend:'Ext.grid.Panel',
	title: '资源信息',	
	region:'center',
	frame:true,
	margin:'0 0 0 2',
	myGridStore:null,
	getMyGridStore:function(){
		if(this.myGridStore==null){
			this.myGridStore=Ext.create('app.slider.grid.store');
		}
		return this.myGridStore;
	},
	myGridtoolbar:null,
	getMyGridtoolbar:function(){
		if(this.myGridtoolbar==null){
			this.myGridtoolbar=Ext.create('app.slider.grid.toolbar',{store : this.store});
		}
		return this.myGridtoolbar;
	},
	columns: [
			  new Ext.grid.RowNumberer(),
	          { text: 'id', hideable: false, hidden: true, dataIndex: 'id' },
	          { text: '版本号',dataIndex: 'version',align:'center'},
	          { text: '标题',  dataIndex: 'title',align:'center' },
	          { text: '图片地址', flex:1,  dataIndex: 'imageUrl' ,align:'center'},
	          { text: '点击连接地址',flex:1,  dataIndex: 'link',align:'center'},
	          { text: '创建时间', dataIndex: 'createtime',width:150,align:'center',renderer: Ext.util.Format.dateRenderer('Y-m-d TH:i:s') }
	          	          
	],
	constructor : function(config) {
	 		var me = this, 
	 		cfg = Ext.apply({}, config);
	 		me.store = me.getMyGridStore();
	 		me.bbar = me.getMyGridtoolbar();
	 		me.callParent([ cfg ]);

	 }      
});




//提交资源表单
Ext.define('app.slider.myformpanel.upform',{
	 extend:'Ext.form.Panel',
	 region:'north',
	 height:120,
//	 frame:true,
//	 title: '表单信息',
	 defaults:{
		 xtype:'textfield',
		 margin:'20 5 5 20'		 
	 },
     layout:'column',
     items: [
     {  
         xtype: 'filefield',  
         name: 'upload',  
         fieldLabel: '附件', 
         labelWidth:50,
         columnWidth: 0.9,
         allowBlank: false,
         buttonText: '选择附件...'  
     }],
     buttons: [{
         text: '提交',
         formBind: true,
         disabled: true,
         handler: function() {
        	 var form = this.up('form').getForm();  
        	 //附件格式判断
        	 var upfilename = form.findField('upload').getValue();
        	 var b=upfilename.split(".");
        	 var n = b.length;
        	 if(n>1){
        		if( b[n-1].toLowerCase()!='zip'){
        			 Ext.Msg.alert('提示','只允许上传.zip文件');
        			return ;
        		}
        	 }else{
        		 return;
        	 }
        	
        	 var panl = this.up('form');
        	 var gridstore = panl.up('panel').getGridpanel().getMystore();
        	 if(gridstore.getCount()==0){
        		 Ext.Msg.alert('提示',"资源明细不能为空");
        		 return;
        	 }
        	 //拼接grid数据
        	 var l ="["
        	 for(var i=0;i<gridstore.getCount();i++){
        		 if(i>0){
        			 l = l+",";
        		 }
        		 l = l+"{'title':'"+gridstore.getAt(i).get('title')+"','imageUrl':'"+gridstore.getAt(i).get('imageUrl')+"','link':'"+gridstore.getAt(i).get('link')+"'}";
        	 }
        	 l=l+"]";

        	 if(form.isValid()){
        		 
        		 var upfilename = formdata.get("upload");
        		 
        		 form.submit({  
                     url : '/hoauapp/sliderfileupload.action',  
                     waitMsg: '正在上传...',  
                     params:{'gridlist' : l},
                     success: function(fp, o) {
                    	 if(o.result.success){
                    		 Ext.Msg.alert('上传成功!',o.result.resultMsg); 
                    		 form.reset();
                    		 gridstore.removeAll();
                    		 panl.up('panel').up('panel').getMyGridpanel().getStore().loadPage(1);
                    	 }else{
                    		 Ext.Msg.alert('上传失败!',o.result.resultMsg);  
                    	 }	 
                     },  
                     failure : function (fp,o){  
                    	 Ext.Msg.alert('上传失败!',o.result.resultMsg);   
//                    	 panl.up('panel').getMyGridpanel().getStore().loadPage(1);
                     }  
                });  
        	 }
        	 
        	  
         }
     }]
});



//提交资源列表
Ext.define('app.slider.myformpanel.upgrid',{
	extend:'Ext.grid.Panel',
	title: '资源明细',	
	region:'center',
//	frame:true,
	mystore:null,
	getMystore:function(){
		if(this.mystore == null){
			this.mystore = Ext.create('app.slider.myformpanel.store');
		}
		return this.mystore;
	},
	mywindow:null,
	getMywindow:function(){
		if(this.mywindow==null){
			this.mywindow = Ext.create('app.slider.myformpanel.windowpanel');
		}
		return this.mywindow;
	},
	tbar:[{
		text:'添加',
		handler: function() {
			var win =this.up('grid').getMywindow();
			win.setGridstore(this.up('grid').getMystore());
			win.show();
		}
	},{
		text:'删除',
		handler:function(){
			var records=this.up('grid').getSelectionModel().getSelection();
			
			if(records.length==0) {
			        Ext.MessageBox.alert('提示','请选择需要删除的明细行');
			}else if(records.length>1){
			        Ext.MessageBox.alert('提示','只能选择一条记录');
			}else {
				
				this.up('grid').getMystore().remove(records);
				
			}
			
			
		}
	}],
	columns: [
	          { text: '标题',  dataIndex: 'title' },
	          { text: '图片地址',flex:1, dataIndex: 'imageUrl' },
	          { text: '点击连接地址', flex:1,dataIndex: 'link' }
	],
	constructor : function(config) {
	  	var me = this, 
	  	cfg = Ext.apply({}, config);
	  	me.store = me.getMystore();	      
	  	me.callParent([ cfg ]);
	 }
});		


//资源提交面板
Ext.define('app.slider.myformpanel',{
	 extend:'Ext.Panel',
     layout:'border',
     height:600,
     width:600,
     frame:true,
     title: '资源提交',
     region:'west',
//     bodyPadding : 0 5 0 0,
     formpanel:null,
     getFormpanel:function(){
    	 if(this.formpanel==null){
    		 this.formpanel = Ext.create('app.slider.myformpanel.upform');
    	 }
    	 return this.formpanel;
     },
     gridpanel:null,
     getGridpanel:function(){
    	 if(this.gridpanel==null){
    		 this.gridpanel = Ext.create('app.slider.myformpanel.upgrid');
    	 }
    	 return this.gridpanel;
     },
     constructor : function(config) {
  		var me = this, 
  		cfg = Ext.apply({}, config);
  		me.items =[me.getFormpanel(),
  		           me.getGridpanel()
  		           ];
  		me.callParent([ cfg ]);

  	 }
});


//主界面
Ext.define('app.slider.mainPanel', {
     extend:'Ext.Panel',
     layout:'border',
     height:600,
//     frame:true,
     bodyPadding : 2,
     myformpanel:null,
     getMyformpanel:function(){
    	if(this.myformpanel==null){
    		this.myformpanel=Ext.create('app.slider.myformpanel');
    	}
    	return this.myformpanel;
     },
     myGridpanel:null,
     getMyGridpanel:function(){
    	 if(this.myGridpanel==null){
    		 this.myGridpanel=Ext.create('app.slider.grid.gridpanle');
    	 }
    	 return this.myGridpanel;
     },
     constructor : function(config) {
 		var me = this, 
 		cfg = Ext.apply({}, config);
 		me.items =[me.getMyformpanel(), 
 		           me.getMyGridpanel()
 		          ];
 		me.callParent([ cfg ]);

 	 }

 });





//初始化开发

 Ext.application({
     name   : 'sliderApp',
     launch : function() {

         Ext.create('app.slider.mainPanel', {
             renderTo :Ext.getBody()
         })

        
     }
 });





