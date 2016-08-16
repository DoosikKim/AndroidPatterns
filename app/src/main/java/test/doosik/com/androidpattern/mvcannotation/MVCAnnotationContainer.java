package test.doosik.com.androidpattern.mvcannotation;

/**
 * Created by 1100038 on 16. 8. 10..
 */
public class MVCAnnotationContainer {
//
//    private static MVCAnnotationContainer container = null;
//
//    private MVCAnnotationContainer(){};
//
//    public static MVCAnnotationContainer getContainer() {
//        if(container == null) {
//            synchronized (MVCAnnotationContainer.class) {
//                if(container == null) {
//                    container = new MVCAnnotationContainer();
//                }
//            }
//        }
//        return container;
//    }
//
//    private Activity activity;
//
//    public void setActivity(Activity activity) {
//        this.activity = activity;
//    }
//
//
//    public void applyAnnotations(Object object) {
//        if(!(object instanceof Activity)) {
//            return;
//        }
//
//        activity = (Activity)object;
//
//        // applying class annotation
//        applyClassAnnotations(object);
//
//        // applying field annotations
//        applyFieldsAnnotations(object);
//
//        // applying method annotations
//        applyMethodsAnnotations(object);
//
//    }
//
//    private void applyClassAnnotations(Object object) {
//        Annotation[] annotations = object.getClass().getAnnotations();
//        for(Annotation annotation : annotations) {
//            if(annotation instanceof EActivity) {
//                int layoutId = ((EActivity) annotation).value();
//                ((Activity)object).setContentView(layoutId);
//            }
//
//            // class에 추가할 annotation있으면 여기에 추가
//        }
//    }
//
//    private void applyFieldsAnnotations(Object object) {
//        Field[] fields = object.getClass().getFields();
//        for(Field field : fields) {
//            Annotation[] annotations = field.getAnnotations();
//            for(Annotation annotation : annotations) {
//                if(annotation instanceof Bean) {
//                    try {
//                        Constructor constructor = field.getType().getDeclaredConstructor();
//                        Object obj = constructor.newInstance();
//                        applyFieldsAnnotations(obj);
//                        applyMethodsAnnotations(obj);
//                        field.setAccessible(true);
//                        field.set(object, obj);
//                    } catch (NoSuchMethodException e) {
//                        e.printStackTrace();
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    } catch (InstantiationException e) {
//                        e.printStackTrace();
//                    } catch (InvocationTargetException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//                if(annotation instanceof ViewById) {
//                    try {
//                        field.setAccessible(true);
//                        if(activity != null) {
//                            field.set(object, activity.findViewById(((ViewById) annotation).value()));
//                        }
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//                // Field에 추가할 annotation있으면 여기에 추가
//            }
//        }
//    }
//
//    private void applyMethodsAnnotations(final Object object) {
//        Method[] methods = object.getClass().getMethods();
//        for(final Method method : methods) {
//            Annotation[] annotations = method.getAnnotations();
//            int layoutId = -1;
//            boolean isBackground = false;
//            boolean isUiThread = false;
//
//            for(Annotation annotation : annotations) {
//                if(annotation instanceof Click) {
//                    layoutId = ((Click) annotation).value();
//                } else if(annotation instanceof Background) {
//                    isBackground = true;
//                } else if(annotation instanceof UiThread) {
//                    isUiThread = true;
//                }
//
//                // Method에 추가할 annotation있으면 여기에 추가
//
//            }
//
//            if(layoutId != -1) {
//                Button button = (Button)((Activity)object).findViewById(layoutId);
//                final boolean finalIsBackground = isBackground;
//                final boolean finalIsUiThread = isUiThread;
//                button.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(final View v) {
//                        if(finalIsBackground) {
//                            new Thread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    try {
//                                        method.invoke(object, v);
//                                    } catch (IllegalAccessException e) {
//                                        e.printStackTrace();
//                                    } catch (InvocationTargetException e) {
//                                        e.printStackTrace();
//                                    }
//                                }
//                            }).start();
//                        } else {
//                            try {
//                                if(finalIsUiThread) {
//                                    activity.runOnUiThread(new Runnable() {
//                                        @Override
//                                        public void run() {
//                                            try {
//                                                method.invoke(object, v);
//                                            } catch (IllegalAccessException e) {
//                                                e.printStackTrace();
//                                            } catch (InvocationTargetException e) {
//                                                e.printStackTrace();
//                                            }
//                                        }
//                                    });
//                                } else {
//                                    method.invoke(object, v);
//                                }
//
//                            } catch (IllegalAccessException e) {
//                                e.printStackTrace();
//                            } catch (InvocationTargetException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                });
//            }
//        }
//
//    }


}
